package com.pluralsight.ui.menus;

import com.pluralsight.data.navigation.OrderMenuOptions;
import com.pluralsight.ui.UserInterface;

public class OrderMenu extends UserInterface {
    @Override
    public <T extends Enum<T>> void printMenuOptions(Class<T> enumClass) {
        System.out.println("Order Menu\nOptions:");
        super.printMenuOptions(enumClass);
    }

    @Override
    public void displayMenu() {
        while(true){
            printMenuOptions(OrderMenuOptions.class);
            String input = scanner.nextLine().trim().toUpperCase();

            switch(input){
                case "0" -> {
                    return;
                }
                case "1" -> System.out.println();
                default -> System.out.println("Invalid Input");
            }
        }
    }
}
