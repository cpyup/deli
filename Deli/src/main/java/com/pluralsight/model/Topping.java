package com.pluralsight.model;

public abstract class Topping implements IGetPrice{
    private final String name;

    public Topping(String name){
        this.name = name;
    }

    @Override
    public abstract double getPrice();
}
