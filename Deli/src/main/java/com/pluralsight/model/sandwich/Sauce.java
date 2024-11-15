package com.pluralsight.model.sandwich;


import com.pluralsight.data.order.ToppingType;

public class Sauce extends Topping{

    public Sauce(ToppingType sauceType) {
        this.toppingType = sauceType;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public ToppingType getType() {
        return toppingType;
    }

    @Override
    public String toString(){
        return toppingType.name().replaceAll("_"," ");
    }
}
