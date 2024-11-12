package com.pluralsight.ui.menus;

import com.pluralsight.data.navigation.MainMenuOptions;

public class MainMenu extends Menu {
    @Override
    protected <T extends Enum<T>> void printMenuOptions(Class<T> enumClass) {
        System.out.println("Main Menu\nOptions:");
        super.printMenuOptions(enumClass);
    }

    @Override
    public void displayMenu() {
        while(true){
            printMenuOptions(MainMenuOptions.class);
            String input = getStringInput("");

            switch(input){
                case "0" -> {
                    return;
                }
                case "1" -> displayOrderMenu();
                default -> System.out.println("Invalid Input");
            }
        }
    }

    private void displayOrderMenu(){
        OrderMenu orderMenu = new OrderMenu();
        orderMenu.displayMenu();
    }
}
