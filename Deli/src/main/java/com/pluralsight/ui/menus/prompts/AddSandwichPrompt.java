package com.pluralsight.ui.menus.prompts;

import com.pluralsight.data.order.*;
import com.pluralsight.model.sandwich.*;
import com.pluralsight.model.sandwich.SignatureSandwich;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddSandwichPrompt extends Prompt{
    protected Size size;
    protected List<Topping> toppings;
    protected Sandwich sandwich;
    protected boolean isToasted;

    public AddSandwichPrompt(){
        toppings = new ArrayList<>();
    }

    @Override
    public void displayMenu() {
        System.out.println("\nCreate New Sandwich\n\nBread Options");
        ToppingType breadType = selectBread();
        size = selectSize();
        // Add toppings based on class type
        toppings.addAll(addTopping(Meat.class));
        toppings.addAll(addTopping(Cheese.class));
        toppings.addAll(addTopping(RegularTopping.class));
        toppings.addAll(addTopping(Sauce.class));

        isToasted = getStringInput("Toasted? (Yes/No): ").equalsIgnoreCase("yes");
        sandwich = new Sandwich(size,breadType,toppings, isToasted);
    }

    public void displaySignatureMenu(){  // TODO: Allow leaving menu without sandwich
        List<Signature> options = Signature.stream().toList();

        while(true){
            System.out.println("\nSignature Sandwich Menu\n\nOptions");
            for (int i = 0; i < options.size(); i++) {
                System.out.println("\t"+(i+1)+" - "+formatEnumOption(options.get(i).toString()));
            }
            String input = getStringInput("\nSelect Signature Sandwich: ");
            try{
                int i = Integer.parseInt(input);
                if(i == 0)return;
                if(i <= options.size() && i > 0){
                    sandwich = new SignatureSandwich(options.get(i-1));
                    return;
                }else{
                    System.out.println("Invalid Input");
                }
            }catch(NumberFormatException e){
                System.out.println("Input Error");
            }
        }
    }

    public Sandwich getSandwich(){
        return sandwich;
    }

    protected ToppingType selectBread(){
        List<ToppingType> breads = getToppingOptions("bread");

        while(true){
            try{
                printToppingOptions(breads);
                String input = getStringInput("\nSelect Desired Bread: ");

                int i = Integer.parseInt(input);

                if(i > 0 && i <= breads.size()){
                    return breads.get(i-1);
                }
                throw new NumberFormatException("Invalid Input");
            }catch (NumberFormatException e){
                System.out.println("Invalid Input");
            }
        }
    }

    protected <T> List<Topping> addTopping(Class<T> itemClass) {
        return addTopping(itemClass, new ArrayList<>());
    }

    protected <T> List<Topping> addTopping(Class<T> itemClass, List<Topping> initialItems) {
        List<Topping> items = new ArrayList<>(initialItems);
        // Class name string, one for enum ref, one for display (splits multiple words from pascal case)
        String className = itemClass.getSimpleName();
        String formattedClass = className.replaceAll("([a-z])([A-Z])","$1 $2").toUpperCase();

        while (true) {
            String input = getStringInput("\nSelect Desired " + formattedClass + "S\nOptions:\n\t1 - Add " + formattedClass +
                    "\n\t2 - Check Selected " + formattedClass + "S\n\t3 - Finish " + formattedClass + "\n");

            switch (input) {
                case "1" -> {
                    Topping t = selectToppings(className.toLowerCase());
                    if(t != null)items.add(t);
                }
                case "2" -> {
                    if(!items.isEmpty()){

                        while(true){
                            System.out.printf("%nCurrent %sS%n", formattedClass);
                            for (int i = 0; i < items.size(); i++) {
                                Topping topping = items.get(i);
                                System.out.println("\t" + (i + 1) + " - " + topping.toString());
                            }

                            input = getStringInput("\nOptions:\n\t0 - Remove "+formattedClass+"\n\tEnter - Go Back\n");

                            if(input.isBlank())break;

                            if(input.equals("0")){
                                items = removeTopping(items,formattedClass);
                                if(items.isEmpty()){
                                    System.out.println("\nNo More "+formattedClass +"S");
                                    break;
                                }
                            }
                        }
                    }else{
                        System.out.println("\nNo "+formattedClass+"S Selected"); // TODO: Look into something similar to this for the toString overrides, should be able to create fake topping with this as name to indicate unused
                    }
                }
                case "3" -> {
                    if(!items.isEmpty()){
                        return items;
                    }else{
                        if(cancelOrContinue("Without "+formattedClass))return items;
                    }
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }

    protected List<ToppingType> getToppingOptions(String type) {
        return ToppingType.stream()
                .filter(topping -> topping.getType().replace("_", "").equalsIgnoreCase(type))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    protected <T> void printToppingOptions(List<T> toppings){
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("\t" + (i+1) + " - "+toppings.get(i));
        }
    }

    protected Topping selectToppings(String verbiage){
        while(true){
            try{
                System.out.println("\n"+verbiage.toUpperCase()+" SELECTION\nOptions:");
                List<ToppingType> menuOptions = getToppingOptions(verbiage);

                // Display options from the enum based on type
                printToppingOptions(menuOptions);
                System.out.println("\t0 - RETURN");
                String input = getStringInput("\nSelect Desired "+ verbiage.toUpperCase() +": ");

                if(input.equals("0"))return null;

                int i = Integer.parseInt(input);
                if(i <= menuOptions.size() && i >= 0){
                    switch (verbiage){
                        case "meat" -> {
                            return new Meat(menuOptions.get(i-1),size);
                        }
                        case "cheese" -> {
                            return new Cheese(menuOptions.get(i-1),size);
                        }
                        case "regulartopping" -> {
                            return new RegularTopping(menuOptions.get(i-1));
                        }
                        case "sauce" -> {
                            return new Sauce(menuOptions.get(i-1));
                        }
                    }
                }else{
                    System.out.println("Invalid Option");
                }
            }catch(NumberFormatException e){
                System.out.println("Invalid Option");
            }
        }
    }

    protected <T> List<T> removeTopping(List<T> toppings, String verbiage) {
        try {
            String input = getStringInput("Select "+ verbiage +" To Remove Or Press 'Enter' To Go Back: ");
            if (input.isBlank()) return toppings;

            int i = Integer.parseInt(input);

            if (i < 0 || i > toppings.size()) {
                throw new IndexOutOfBoundsException();
            } else {
                toppings.remove(i-1);
                return toppings;
            }

        } catch (Exception e) {
            System.out.println("\nInput Error\n");
        }
        return toppings;
    }
}
