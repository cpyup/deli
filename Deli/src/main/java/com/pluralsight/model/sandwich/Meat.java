package com.pluralsight.model.sandwich;

import com.pluralsight.data.order.Size;
import com.pluralsight.data.order.ToppingType;

public class Meat extends PremiumTopping{
    private final ToppingType meatType;
    public Meat(ToppingType meatType, Size size) {
        super(size);
        this.meatType = meatType;
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

    @Override
    public String toString(){
        return meatType.name().replaceAll("_"," ");
    }
}
