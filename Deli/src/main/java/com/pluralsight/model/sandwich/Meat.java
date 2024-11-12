package com.pluralsight.model.sandwich;

import com.pluralsight.data.options.MeatType;
import com.pluralsight.data.options.Size;

public class Meat extends PremiumTopping{
    private final MeatType meatType;
    public Meat(MeatType meatType, Size size) {
        super(meatType.name(), size);
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
        return meatType.name();
    }
}
