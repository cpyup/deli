package com.pluralsight.model.sandwich.signature;

import com.pluralsight.data.options.Size;
import com.pluralsight.data.options.ToppingType;
import com.pluralsight.model.sandwich.SignatureSandwich;
import com.pluralsight.model.sandwich.Topping;

import java.util.List;

public class PhillyCheeseSteak extends SignatureSandwich {
    public PhillyCheeseSteak(Size size, ToppingType breadType, List<Topping> toppings, boolean isToasted) { // TODO: Initialize with toppings
        super(size, breadType, toppings, isToasted, "Philly Cheese Steak");
    }
}
