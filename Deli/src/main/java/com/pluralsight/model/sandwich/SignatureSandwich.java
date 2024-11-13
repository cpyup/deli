package com.pluralsight.model.sandwich;

import com.pluralsight.data.options.Size;
import com.pluralsight.data.options.ToppingType;

import java.util.List;

public abstract class SignatureSandwich extends Sandwich{
    private String name;
    public SignatureSandwich(Size size, ToppingType breadType, List<Topping> toppings, boolean isToasted, String name) {
        super(size, breadType, toppings, isToasted);
        this.name = name;
    }
}
