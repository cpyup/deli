package com.pluralsight.ui.menus;

import com.pluralsight.model.order.*;
import com.pluralsight.persistence.FileManager;
import com.pluralsight.ui.menus.prompts.AddChipsPrompt;
import com.pluralsight.ui.menus.prompts.AddDrinkPrompt;
import com.pluralsight.ui.menus.prompts.AddSandwichPrompt;

public class OrderMenu extends Menu {
    private final Order order;

    public OrderMenu(){
        order = new Order();
    }

    public void requestAddToOrder(OrderItem orderItem){
        order.addOrderItem(orderItem);
    }

    @Override
    public void displayMenu() {
        while(true){
            System.out.println("Order Menu\nOptions:");
            printEnumOptions(getMenuOptions(this.getClass().getSimpleName()));
            String input = getStringInput("");

            switch(input){
                case "0" -> {
                    return;
                }
                case "1" -> {
                    AddSandwichPrompt sandwichPrompt = new AddSandwichPrompt();
                    sandwichPrompt.displayMenu();
                    requestAddToOrder(sandwichPrompt.getSandwich());
                }

                case "2" -> {
                    AddDrinkPrompt drinkPrompt = new AddDrinkPrompt();
                    drinkPrompt.displayMenu();
                    requestAddToOrder(drinkPrompt.getDrink());
                }

                case "3" -> {
                    AddChipsPrompt chipsPrompt = new AddChipsPrompt();
                    chipsPrompt.displayMenu();
                    requestAddToOrder(chipsPrompt.getChips());
                }

                case "4" -> {
                    displayOrderItems();
                    displayOrderPrice();
                    FileManager.saveReceipt(order.toString());
                    return;
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }

    private void displayOrderItems(){
        System.out.println(order);
    }

    private void displayOrderPrice(){
        System.out.println(order.getPrice());
    }
}
