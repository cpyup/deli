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
                case "1" -> { // Custom Sandwiches
                    AddSandwichPrompt sandwichPrompt = new AddSandwichPrompt();
                    sandwichPrompt.displayMenu();
                    requestAddToOrder(sandwichPrompt.getSandwich());
                }

                case "2" -> { // Signatures
                    AddSandwichPrompt sandwichPrompt = new AddSandwichPrompt();
                    sandwichPrompt.displaySignatureMenu();

                    // Offer to customize
                    if(getStringInput("Customize Sandwich? (Yes/No)").equalsIgnoreCase("yes")){
                        AddSandwichPrompt editPrompt = new EditSandwichPrompt(sandwichPrompt.getSandwich());
                        editPrompt.displayMenu();
                        requestAddToOrder(editPrompt.getSandwich());
                    }else{
                        requestAddToOrder(sandwichPrompt.getSandwich());
                    }
                }

                case "3" -> { // Drinks
                    AddExtrasPrompt drinkPrompt = new AddExtrasPrompt("drink");
                    drinkPrompt.displayMenu();
                    requestAddToOrder(drinkPrompt.getOrderItem());
                }

                case "4" -> { // Chips
                    AddExtrasPrompt chipPrompt = new AddExtrasPrompt("Chips");
                    chipPrompt.displayMenu();
                    requestAddToOrder(chipPrompt.getOrderItem());
                }

                case "5" -> { // Checkout
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

        if(cancelOrContinue("Checkout")){
            FileManager.saveReceipt(checkoutString);
            confirmContinue("Press Enter To Continue");
        }else{
            System.out.println();
        }
    }
}
