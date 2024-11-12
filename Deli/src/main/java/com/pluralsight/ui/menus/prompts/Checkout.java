package com.pluralsight.ui.menus.prompts;

import com.pluralsight.model.order.Order;

public class Checkout extends Prompt{
    private Order order;

    public Checkout(Order order){
        this.order = order;
    }
    @Override
    public void displayMenu() {
        displayTotalCost();
    }

    public void displayTotalCost(){
        System.out.println(order.getPrice());
    }

    public void displayOrderItems(){

    }
}
