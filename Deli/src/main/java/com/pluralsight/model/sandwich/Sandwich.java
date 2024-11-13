package com.pluralsight.model.sandwich;

import com.pluralsight.data.options.BreadType;
import com.pluralsight.data.options.Size;
import com.pluralsight.model.order.SizeableOrderItem;

import java.util.List;

public class Sandwich extends SizeableOrderItem {

    private BreadType breadType;
    private final List<Topping> toppings;
    private boolean isToasted;

    public Sandwich(Size size, BreadType breadType, List<Topping> toppings, boolean isToasted) {
        this.size = size;
        this.breadType = breadType;
        this.toppings = toppings;
        this.isToasted = isToasted;
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
        double price;

        switch (size){
            case SMALL -> price = 5.50;
            case MEDIUM -> price = 7.00;
            case LARGE -> price = 8.50;
            default -> price = 0;
        }

        for(Topping topping : toppings){
            if(topping instanceof Meat){
                price += topping.getPrice();
            } else if (topping instanceof Cheese) {
                price += topping.getPrice();
            } 
        }

        return price;
    }

    @Override
    public String toString(){
        return "\n" + size.toString() + " " + breadType.toString() + (isToasted ? " (TOASTED)\n" : "\n") + toppingString();
    }

    private String toppingString(){
        if(toppings.isEmpty())return "NONE";
        StringBuilder out = new StringBuilder();
        toppings.forEach(topping -> out.append("\t").append(topping.toString()).append("\n"));
        return out.toString();
    }
}
