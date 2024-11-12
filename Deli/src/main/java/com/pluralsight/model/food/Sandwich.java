package com.pluralsight.model.food;

import com.pluralsight.data.options.BreadType;
import com.pluralsight.data.options.Size;
import com.pluralsight.interfaces.IGetPrice;
import com.pluralsight.model.topping.Topping;

import java.util.List;

public class Sandwich implements IGetPrice {
    private Size size;
    private BreadType breadType;
    private List<Topping> toppings;
    private boolean isToasted;

    public Sandwich(Size size, BreadType breadType, List<Topping> toppings, boolean isToasted) {
        this.size = size;
        this.breadType = breadType;
        this.toppings = toppings;
        this.isToasted = isToasted;
    }

    public Sandwich(){

    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}