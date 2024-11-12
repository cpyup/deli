package com.pluralsight.model.order;

import java.util.ArrayList;
import java.util.List;

public class Order {
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

    public double calculateTotalPrice(){
        return 9999;
    }

    public void generateReceipt(){

    }
}
