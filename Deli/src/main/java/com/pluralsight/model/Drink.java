package com.pluralsight.model;

import com.pluralsight.data.DrinkFlavor;
import com.pluralsight.data.Size;
import com.pluralsight.interfaces.IGetPrice;

public class Drink implements IGetPrice {
    private DrinkFlavor drinkFlavor;
    private Size size;

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
