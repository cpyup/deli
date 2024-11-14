package com.pluralsight.model.extras;

import com.pluralsight.data.order.OrderExtras;
import com.pluralsight.data.order.Size;
import com.pluralsight.model.order.SizeableOrderItem;

public class Drink extends SizeableOrderItem {
    private final OrderExtras drinkFlavor;

    public Drink(OrderExtras drinkFlavor, Size size){
        this.drinkFlavor = drinkFlavor;
        this.size = size;
    }

    @Override
    public double getPrice() {
        switch (size){
            case LARGE -> {
                return 3.00;
            }
            case MEDIUM -> {
                return 2.50;
            }
            case SMALL -> {
                return 2.00;
            }
            default -> {
                return 0;
            }

        }
    }

    @Override
    public String toString(){
        return String.format("DRINK\n-%s %s +$%.2f%n", size.name(), drinkFlavor.toString().replaceAll("_"," "), getPrice());
    }
}
