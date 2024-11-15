package com.pluralsight.model.sandwich;

import com.pluralsight.data.order.Size;
import com.pluralsight.data.order.ToppingType;

public class Cheese extends PremiumTopping{

    public Cheese(ToppingType toppingType, Size size) {
        super(toppingType,size);
    }

    @Override
    public double getPrice() {
        switch (size){
            case LARGE -> {
                return 2.25;
            }
            case MEDIUM -> {
                return 1.50;
            }
            case SMALL -> {
                return .75;
            }
            default -> {
                return 0;
            }

        }
    }

    @Override
    public ToppingType getType() {
        return toppingType;
    }
}
