package com.pluralsight.ui.menus.prompts;

import com.pluralsight.data.order.OrderExtras;
import com.pluralsight.model.extras.Chips;
import com.pluralsight.model.extras.Drink;
import com.pluralsight.model.order.OrderItem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddExtrasPrompt extends SizeablePrompt{
    private OrderItem orderItem;
    private final String type;

    public AddExtrasPrompt(String type){
        this.orderItem = null;
        this.type = type;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(){
        if(type.equalsIgnoreCase("drink")){
            orderItem = new Drink(selectExtras(),selectSize());
        }else if(type.equalsIgnoreCase("chips")){
            orderItem = new Chips(selectExtras());
        }
    }

    @Override
    public void displayMenu(){
        System.out.println("\nAdd New "+ type +"\nOptions:");
        setOrderItem();
    }

    private OrderExtras selectExtras(){
        List<OrderExtras> extras = getExtrasOptions(type);
        while (true){
            try{
                printEnumOptions(extras);
                String input = getStringInput("\nSelect Desired "+type+": ");

                int i = Integer.parseInt(input);

                if(i > 0 && i <= extras.size()){
                    return extras.get(i-1);
                }
                throw new NumberFormatException("Invalid Input");
            }catch(NumberFormatException e){
                System.out.println("Invalid Input");
            }
        }
    }

    private List<OrderExtras> getExtrasOptions(String type){
        return OrderExtras.stream()
                .filter(item -> item.getType().replace("_", "").equalsIgnoreCase(type))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
