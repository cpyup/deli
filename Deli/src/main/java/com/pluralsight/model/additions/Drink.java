package com.pluralsight.model.additions;

import com.pluralsight.data.options.DrinkFlavor;
import com.pluralsight.data.options.Size;
import com.pluralsight.model.order.OrderItem;

public class Drink extends OrderItem {
    private final DrinkFlavor drinkFlavor;
    private final Size size;

    public Drink(DrinkFlavor drinkFlavor, Size size){
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
}
