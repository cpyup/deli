package com.pluralsight.model.sandwich;

import com.pluralsight.data.order.ToppingType;

public class RegularTopping extends Topping{
    private final ToppingType toppingType;
    public RegularTopping(ToppingType toppingType) {
        this.toppingType = toppingType;
    }

    @Override
    public ToppingType getType() {
        return toppingType;
    }

    @Override
    public double getPrice() { // This should actually return zero DUN4GET
        return 0;
    }

    @Override
    public String toString(){
        return toppingType.name().replaceAll("_"," ");
    }


}
