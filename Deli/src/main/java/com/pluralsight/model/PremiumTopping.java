package com.pluralsight.model;

public abstract class PremiumTopping extends Topping {
    Size size;
    public PremiumTopping(String name, Size size) {
        super(name);
    }

}
