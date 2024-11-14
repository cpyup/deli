package com.pluralsight.model.sandwich.signature;

import com.pluralsight.data.order.Size;
import com.pluralsight.data.order.ToppingType;
import com.pluralsight.model.sandwich.Sandwich;
import com.pluralsight.model.sandwich.Topping;

import java.util.List;

public abstract class SignatureSandwich extends Sandwich {
    private final String name;
    public SignatureSandwich(Size size, ToppingType breadType, List<Topping> toppings, boolean isToasted, String name) {
        super(size, breadType, toppings, isToasted);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return String.format("%n%s%n-%s %s %s +$%.2f%n%s", name.toUpperCase(),
                size.toString(), breadType.toString(), (isToasted ? "[TOASTED]" : ""), getBreadPrice(), toppingString());
    }
}
