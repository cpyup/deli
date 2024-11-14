package com.pluralsight.model.sandwich;

import com.pluralsight.data.order.Size;
import com.pluralsight.data.order.ToppingType;

public abstract class PremiumTopping extends Topping {
    Size size;
    ToppingType toppingType;
    public PremiumTopping(ToppingType toppingType,Size size) {
        this.toppingType = toppingType;
        this.size = size;
    }

    @Override
    public String toString(){
        return String.format("%s +$%.2f",toppingType.name().replaceAll("_"," "),getPrice());
    }


}
