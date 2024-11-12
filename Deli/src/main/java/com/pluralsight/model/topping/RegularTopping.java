package com.pluralsight.model.topping;

public class RegularTopping extends Topping{
    public RegularTopping(String name) {
        super(name);
    }

    @Override
    public double getPrice() { // This should actually return zero DUN4GET
        return 0;
    }
}
