package com.pluralsight.ui.menus;

import com.pluralsight.model.order.*;
import com.pluralsight.persistence.FileManager;
import com.pluralsight.ui.menus.prompts.*;

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
            System.out.println("\nOrder Menu\nOptions:");
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
                    checkoutOrderItems();
                    return;
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }

    private void checkoutOrderItems(){
        String checkoutString = String.format("%n%sORDER TOTAL: $%.2f%n",order,order.getPrice());
        System.out.println(checkoutString);
        //System.out.println();

        //displayOrderItems();
        //displayOrderPrice();

        //System.out.println();
        if(cancelOrContinue("Checkout")){
            FileManager.saveReceipt(checkoutString);
           // FileManager.saveReceipt(order.toString());
            confirmContinue("Press Enter To Continue");
        }else{
            System.out.println();
        }
    }
}
