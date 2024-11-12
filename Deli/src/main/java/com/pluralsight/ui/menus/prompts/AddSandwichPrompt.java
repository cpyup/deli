package com.pluralsight.ui.menus.prompts;

import com.pluralsight.data.options.*;
import com.pluralsight.model.sandwich.*;

import java.util.ArrayList;
import java.util.List;

public class AddSandwichPrompt extends Prompt{
    private Size size;
    private final List<Topping> toppings = new ArrayList<>();
    @Override
    public void displayMenu() {
        System.out.println("Create New Sandwich");
        BreadType breadType = selectBread();
        size = selectSize();

        toppings.addAll(addMeats());
        toppings.addAll(addCheeses());
        toppings.addAll(addToppings());
        toppings.addAll(addSauces());

        boolean isToasted = getStringInput("Toasted? (Yes/No)").equalsIgnoreCase("yes");

        Sandwich sandwich = new Sandwich(size, breadType,toppings, isToasted);
    }

    private BreadType selectBread(){
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

    private Size selectSize(){
        while(true){
            System.out.println("Size Options");
            printMenuOptions(Size.class);
            String input = getStringInput("\nSelect Desired Size: ");

            switch(input){
                case "1" -> {
                    return Size.SMALL;
                }
                case "2" -> {
                    return Size.MEDIUM;
                }
                case "3" -> {
                    return Size.LARGE;
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }

    private List<Meat> addMeats(){
        List<Meat> meats = new ArrayList<>();
        while(true){
            String input = getStringInput("Select Desired Meats\n\t1 - Add Meat\n\t2 - Check Selected Meats\n\t3 - Finish Meats\n");

            switch (input){
                case "1" -> meats.add(selectMeat());
                case "2" -> {
                    System.out.println("Current Selection");
                    for (int i = 0; i < meats.size(); i++) {
                        Meat meat = meats.get(i);
                        System.out.println("\t" + (i + 1) + " - " + meat.toString());
                    }
                    System.out.println(); // Newline after list
                }
                case "3" -> {
                    if(!meats.isEmpty()){
                        return meats;
                    }
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }

    private Meat selectMeat(){
        while(true){
            System.out.println("Meat Options");
            printMenuOptions(MeatType.class);
            String input = getStringInput("\nSelect Desired Meat: ");

            switch (input){
                case "1" -> {
                    return new Meat(MeatType.STEAK,size);
                }
                case "2" -> {
                    return new Meat(MeatType.HAM,size);
                }
                case "3" -> {
                    return new Meat(MeatType.SALAMI,size);
                }
                case "4" -> {
                    return new Meat(MeatType.ROAST_BEEF,size);
                }
                case "5" -> {
                    return new Meat(MeatType.CHICKEN,size);
                }
                case "6" -> {
                    return new Meat(MeatType.BACON,size);
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }

    private List<Cheese> addCheeses(){
        List<Cheese> cheeses = new ArrayList<>();
        while(true){
            String input = getStringInput("Select Desired Cheeses\n\t1 - Add Cheese\n\t2 - Check Selected Cheeses\n\t3 - Finish Cheeses\n");

            switch (input){
                case "1" -> cheeses.add(selectCheese());
                case "2" -> {
                    System.out.println("Current Selection");
                    for (int i = 0; i < cheeses.size(); i++) {
                        Cheese cheese = cheeses.get(i);
                        System.out.println("\t" + (i + 1) + " - " + cheese.toString());
                    }
                    System.out.println(); // Newline after list
                }
                case "3" -> {
                    if(!cheeses.isEmpty()){
                        return cheeses;
                    }
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }

    private Cheese selectCheese(){
        while(true){
            System.out.println("Cheese Options");
            printMenuOptions(CheeseType.class);
            String input = getStringInput("\nSelect Desired Cheese: ");

            switch (input){
                case "1" -> {
                    return new Cheese(CheeseType.AMERICAN,size);
                }
                case "2" -> {
                    return new Cheese(CheeseType.PROVOLONE,size);
                }
                case "3" -> {
                    return new Cheese(CheeseType.CHEDDAR,size);
                }
                case "4" -> {
                    return new Cheese(CheeseType.SWISS,size);
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }

    private List<RegularTopping> addToppings(){
        List<RegularTopping> toppings = new ArrayList<>();
        while(true){
            String input = getStringInput("Select Desired Toppings\n\t1 - Add Topping\n\t2 - Check Selected Toppings\n\t3 - Finish Toppings\n");

            switch (input){
                case "1" -> toppings.add(selectTopping());
                case "2" -> {
                    System.out.println("Current Selection");
                    for (int i = 0; i < toppings.size(); i++) {
                        RegularTopping topping = toppings.get(i);
                        System.out.println("\t" + (i + 1) + " - " + topping.toString());
                    }
                    System.out.println(); // Newline after list
                }
                case "3" -> {
                    if(!toppings.isEmpty()){
                        return toppings;
                    }
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }

    private RegularTopping selectTopping(){
        while(true){
            System.out.println("Toppings");
            printMenuOptions(ToppingType.class);
            String input = getStringInput("\nSelect Desired Topping: ");

            switch (input){
                case "1" -> {
                    return new RegularTopping(ToppingType.LETTUCE);
                }
                case "2" -> {
                    return new RegularTopping(ToppingType.PEPPERS);
                }
                case "3" -> {
                    return new RegularTopping(ToppingType.ONIONS);
                }
                case "4" -> {
                    return new RegularTopping(ToppingType.TOMATOES);
                }
                case "5" -> {
                    return new RegularTopping(ToppingType.JALEPENOS);
                }
                case "6" -> {
                    return new RegularTopping(ToppingType.CUCUMBERS);
                }
                case "7" -> {
                    return new RegularTopping(ToppingType.PICKLES);
                }
                case "8" -> {
                    return new RegularTopping(ToppingType.GUACAMOLE);
                }
                case "9" -> {
                    return new RegularTopping(ToppingType.MUSHROOMS);
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }

    private List<Sauce> addSauces(){
        List<Sauce> sauces = new ArrayList<>();
        while(true){
            String input = getStringInput("Select Desired Sauces\n\t1 - Add Sauce\n\t2 - Check Selected Sauces\n\t3 - Finish Sauces\n");

            switch (input){
                case "1" -> sauces.add(selectSauce());
                case "2" -> {
                    System.out.println("Current Selection");
                    for (int i = 0; i < sauces.size(); i++) {
                        Sauce sauce = sauces.get(i);
                        System.out.println("\t" + (i + 1) + " - " + sauce.toString());
                    }
                    System.out.println(); // Newline after list
                }
                case "3" -> {
                    if(!sauces.isEmpty()){
                        return sauces;
                    }
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }

    private Sauce selectSauce(){
        while(true){
            System.out.println("Sauce Options");
            printMenuOptions(SauceType.class);
            String input = getStringInput("\nSelect Desired Sauce: ");

            switch (input){
                case "1" -> {
                    return new Sauce(SauceType.MAYO);
                }
                case "2" -> {
                    return new Sauce(SauceType.MUSTARD);
                }
                case "3" -> {
                    return new Sauce(SauceType.KETCHUP);
                }
                case "4" -> {
                    return new Sauce(SauceType.RANCH);
                }
                case "5" -> {
                    return new Sauce(SauceType.THOUSAND_ISLAND);
                }
                case "6" -> {
                    return new Sauce(SauceType.VINAIGRETTE);
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }
}
