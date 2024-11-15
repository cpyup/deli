package com.pluralsight.model.order;

import com.pluralsight.model.interfaces.IGetPrice;

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

    public boolean isEmpty(){
        return orderItems.isEmpty();
    }

    @Override
    public double getPrice(){
        double totalPrice = 0;
        for(OrderItem item : orderItems){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString(){
        StringBuilder out = new StringBuilder();
        for(OrderItem item : orderItems){
            out.append(item).append("\n");
        }
        return out.toString();
    }

}
