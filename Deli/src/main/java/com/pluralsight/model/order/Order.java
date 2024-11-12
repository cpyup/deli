package com.pluralsight.model.order;

import com.pluralsight.interfaces.IGetPrice;
import com.pluralsight.model.additions.Chips;
import com.pluralsight.model.additions.Drink;
import com.pluralsight.model.sandwich.Sandwich;

import java.util.ArrayList;
import java.util.List;

public class Order implements IGetPrice {
    private final List<OrderItem> orderItems;

    public Order(){
        orderItems = new ArrayList<>();
    }

    public void addOrderItem(OrderItem item){
        orderItems.add(item);
    }

    public List<OrderItem> getOrderItems(){
        return orderItems;
    }

    public double getPrice(){
        double totalPrice = 0;
        for(OrderItem item : orderItems){
            if(item instanceof Sandwich){
                totalPrice += item.getPrice();
            }else if(item instanceof Drink){
                totalPrice += item.getPrice();
            }else if(item instanceof Chips){
                totalPrice += item.getPrice();
            }
        }
        return totalPrice;
    }

    public void generateReceipt(){

    }
}
