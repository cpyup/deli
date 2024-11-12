package com.pluralsight.ui.menus.prompts;

import com.pluralsight.data.options.DrinkFlavor;
import com.pluralsight.model.additions.Drink;

public class AddDrinkPrompt extends SizeablePrompt{
    private Drink drink;

    public AddDrinkPrompt(){
        this.drink = null;
    }

    @Override
    public void displayMenu() {
        System.out.println("Add New Drink");
        setDrink();
    }

    public Drink getDrink(){
        return drink;
    }

    private void setDrink(){
        this.drink = new Drink(selectDrink(),selectSize());
    }

    private DrinkFlavor selectDrink(){
        while (true){
            printMenuOptions(DrinkFlavor.class);
            String input = getStringInput("\nSelect Desired Drink: ");

            switch (input){
                case "1" -> {
                    return DrinkFlavor.MOUNTAIN_SWEAT;
                }
                case "2" -> {
                    return DrinkFlavor.BEPIS;
                }
                case "3" -> {
                    return DrinkFlavor.DIET_BEPIS;
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }
}
