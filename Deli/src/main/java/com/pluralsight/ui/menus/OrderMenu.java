package com.pluralsight.ui.menus;

import com.pluralsight.data.navigation.OrderMenuOptions;
import com.pluralsight.model.order.Order;
import com.pluralsight.model.order.OrderItem;
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
                    AddSandwichPrompt sandwichPrompt = new AddSandwichPrompt();
                    sandwichPrompt.displayMenu();
                    requestAddToOrder(sandwichPrompt.getSandwich());
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }
}
