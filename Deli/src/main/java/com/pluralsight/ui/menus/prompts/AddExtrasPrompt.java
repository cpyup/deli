package com.pluralsight.ui.menus.prompts;

import com.pluralsight.data.order.OrderExtras;
import com.pluralsight.model.extras.Chips;
import com.pluralsight.model.order.OrderItem;

public class AddExtrasPrompt extends Prompt{
    private OrderItem orderItem;
    private String type;

    public AddExtrasPrompt(String type){
        this.orderItem = null;
        this.type = type;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem){
        this.orderItem = orderItem;
    }

    @Override
    public void displayMenu(){
        System.out.println("\nAdd New");
        //setOrderItem(orderItem = new Chips());
        if(type.equalsIgnoreCase("chips")){
          //  setOrderItem(new Chips());
        }else if(type.equalsIgnoreCase("drink")){

        }
    }
}
