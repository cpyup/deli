package com.pluralsight.ui.menus;

public class MainMenu extends Menu {

    @Override
    public void displayMenu() {
        while(true){
            System.out.println("Main Menu\nOptions:");
            printEnumOptions(getMenuOptions(this.getClass().getSimpleName().toLowerCase()));
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
