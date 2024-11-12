package com.pluralsight.model.sandwich;

import com.pluralsight.data.options.SauceType;

public class Sauce extends Topping{
    private final SauceType sauceType;

    public Sauce(SauceType sauceType) {
        super(sauceType.name());
        this.sauceType = sauceType;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String toString(){
        return sauceType.name();
    }
}
