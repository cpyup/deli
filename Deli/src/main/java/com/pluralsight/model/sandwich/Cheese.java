package com.pluralsight.model.sandwich;

import com.pluralsight.data.options.CheeseType;
import com.pluralsight.data.options.Size;

public class Cheese extends PremiumTopping{
    private final CheeseType cheeseType;
    public Cheese(CheeseType cheeseType, Size size) {
        super(cheeseType.name(), size);
        this.cheeseType = cheeseType;
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
    public String toString(){
        return cheeseType.name();
    }
}
