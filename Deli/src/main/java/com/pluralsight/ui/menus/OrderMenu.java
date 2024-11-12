package com.pluralsight.ui.menus;

import com.pluralsight.data.navigation.OrderMenuOptions;
import com.pluralsight.ui.menus.prompts.AddSandwichPrompt;
import com.pluralsight.ui.menus.prompts.Prompt;

public class OrderMenu extends Menu {
    @Override
    public <T extends Enum<T>> void printMenuOptions(Class<T> enumClass) {
        System.out.println("Order Menu\nOptions:");
        super.printMenuOptions(enumClass);
    }

    @Override
    public void displayMenu() {
        while(true){
            printMenuOptions(OrderMenuOptions.class);
            String input = getStringInput("");

            switch(input){
                case "0" -> {
                    return;
                }
                case "1" -> {
                    Prompt sandwichPrompt = new AddSandwichPrompt();
                    sandwichPrompt.displayMenu();
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }
}
