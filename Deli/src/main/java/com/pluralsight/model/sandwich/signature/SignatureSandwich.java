package com.pluralsight.model.sandwich.signature;

import com.pluralsight.data.options.Size;
import com.pluralsight.data.options.ToppingType;
import com.pluralsight.model.sandwich.Sandwich;
import com.pluralsight.model.sandwich.Topping;

import java.util.List;

public abstract class SignatureSandwich extends Sandwich {
    private String name;
    public SignatureSandwich(Size size, ToppingType breadType, List<Topping> toppings, boolean isToasted, String name) {
        super(size, breadType, toppings, isToasted);
        this.name = name;
    }
}
