package com.pluralsight.model;

import com.pluralsight.model.menu.Size;

public class Meat extends PremiumTopping{

    public Meat(String name, Size size) {
        super(name, size);
    }

    @Override
    public double getPrice() {
        switch (size){
            case LARGE -> {
                return 3.00;
            }
            case MEDIUM -> {
                return 2.00;
            }
            case SMALL -> {
                return 1.00;
            }
            default -> {
                return 0;
            }

        }
    }
}
