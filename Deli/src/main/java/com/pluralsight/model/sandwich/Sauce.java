package com.pluralsight.model.sandwich;


import com.pluralsight.data.order.ToppingType;

public class Sauce extends Topping{
    private final ToppingType sauceType;

    public Sauce(ToppingType sauceType) {
        this.sauceType = sauceType;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String toString(){
        return sauceType.name().replaceAll("_"," ");
    }
}
