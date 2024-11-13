package com.pluralsight.ui.menus.prompts;

import com.pluralsight.data.options.*;
import com.pluralsight.model.sandwich.*;

import java.util.ArrayList;

import java.util.List;

import java.util.stream.Collectors;

public class AddSandwichPrompt extends SizeablePrompt{
    protected Size size;
    protected List<Topping> toppings;
    protected Sandwich sandwich;
    protected boolean isToasted;

    public AddSandwichPrompt(){
        toppings = new ArrayList<>();
    }

    @Override
    public void displayMenu() {
        System.out.println("Create New Sandwich");
        BreadType breadType = selectBread();
        size = selectSize();

        toppings.addAll(addTopping(Meat.class));
        toppings.addAll(addTopping(Cheese.class));
        toppings.addAll(addTopping(RegularTopping.class));
        toppings.addAll(addTopping(Sauce.class));

        isToasted = getStringInput("Toasted? (Yes/No): ").equalsIgnoreCase("yes");

        sandwich = new Sandwich(size, breadType,toppings, isToasted);
    }

    public Sandwich getSandwich(){
        return sandwich;
    }

    protected BreadType selectBread(){
        while(true){
            System.out.println("Bread Options");
            printMenuOptions(BreadType.class);
            String input = getStringInput("\nSelect Desired Bread: ");

            switch(input){
                case "1" -> {
                    return BreadType.WHITE;
                }
                case "2" -> {
                    return BreadType.WHEAT;
                }
                case "3" -> {
                    return BreadType.RYE;
                }
                case "4" -> {
                    return BreadType.WRAP;
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }

    public void printToppingOptions(List<ToppingType> toppings){
        System.out.println("\n'Enter' To Return");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("\t" + (i+1) + " - "+toppings.get(i));
        }
    }

    public List<ToppingType> getToppingOptions(String type){
        return ToppingType.stream().filter(toppings1 -> toppings1.getType().replace("_","").equalsIgnoreCase(type)).collect(Collectors.toCollection(ArrayList::new));
    }

    private <T> List<Topping> addTopping(Class<T> itemClass) {
        List<Topping> items = new ArrayList<>();
        String className = itemClass.getSimpleName();

        while (true) {
            String input = getStringInput("Select Desired " + className + "s\n\t1 - Add " + className + "\n\t2 - Check Selected " + className + "s\n\t3 - Finish " + className + "s\n");

            switch (input) {
                case "1" -> {
                    Topping t = selectToppings(className.toLowerCase());
                    if(t != null)items.add(t);
                }
                case "2" -> {
                    if(!items.isEmpty()){

                    while(true){
                        System.out.println("Current Selection");
                        for (int i = 0; i < items.size(); i++) {
                            Topping topping = items.get(i);
                            System.out.println("\t" + (i + 1) + " - " + topping.toString());
                        }

                        input = getStringInput("Options:\n\t1 - Remove "+className+"\n\tEnter - Go Back\n");

                        if(input.isBlank())break;

                        if(input.equals("1")){
                            items = removeTopping(items,className);
                        }
                    }
                }else{
                    System.out.println("No "+className+" Selected");
                }
                }
                case "3" -> {
                    if(!items.isEmpty()){
                        return items;
                    }else{
                        if(cancelOrContinue("Without "+className))return items;
                    }
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }

    private Topping selectToppings(String verbiage){
        while(true){
            try{
                System.out.println("\n"+verbiage.toUpperCase());
                List<ToppingType> menuOptions = getToppingOptions(verbiage);
                printToppingOptions(menuOptions);
                String input = getStringInput("\nSelect Desired "+ verbiage.toUpperCase() +": ");

                if(input.isBlank())return null;

                int i = Integer.parseInt(input);

                if(i <= menuOptions.size()){
                    switch (verbiage){
                        case "meat" -> {
                            return new Meat(menuOptions.get(i-1),size);
                        }

                        case "cheese" -> {
                            return new Cheese(menuOptions.get(i-1),size);
                        }

                        case "regular_topping" -> {
                            return new RegularTopping(menuOptions.get(i-1));
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

            if (i <= 0 || i > toppings.size()) {
                throw new IndexOutOfBoundsException();
            } else {
                toppings.remove(i - 1);
            }

        } catch (Exception e) {
            System.out.println("\nInput Error\n");
        }
        return toppings;
    }
}
