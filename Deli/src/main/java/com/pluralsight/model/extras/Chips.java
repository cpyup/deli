package com.pluralsight.model.extras;

import com.pluralsight.data.order.OrderExtras;
import com.pluralsight.model.order.OrderItem;

public class Chips extends OrderItem {
    private final OrderExtras chipType;

    public Chips(OrderExtras chipType){
        this.chipType = chipType;
    }

    @Override
    public double getPrice() {
        return 1.50;
    }

    @Override
    public String toString(){
        return chipType.toString().replaceAll("_"," ");
    }
}
