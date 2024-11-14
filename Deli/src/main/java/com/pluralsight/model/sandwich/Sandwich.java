package com.pluralsight.model.sandwich;

import com.pluralsight.data.order.Size;
import com.pluralsight.data.order.ToppingType;
import com.pluralsight.model.order.SizeableOrderItem;

import java.util.List;

public class Sandwich extends SizeableOrderItem {

    private ToppingType breadType;
    private final List<Topping> toppings;
    private boolean isToasted;

    public Sandwich(Size size, ToppingType breadType, List<Topping> toppings, boolean isToasted) {
        this.size = size;
        this.breadType = breadType;
        this.toppings = toppings;
        this.isToasted = isToasted;
    }

    public ToppingType getBreadType() {
        return breadType;
    }

    public void setBreadType(ToppingType breadType) {
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
        double price = getBreadPrice();

        for(Topping topping : toppings){
            price += topping.getPrice();
        }

        return price;
    }

    @Override
    public String toString(){
        return String.format("%nSANDWICH%n-%s %s %s +$%.2f%n%s", size.toString(), breadType.toString(), (isToasted ? "[TOASTED]" : ""), getBreadPrice(), toppingString());
    }

    private double getBreadPrice(){
        switch (size){
            case SMALL -> {
                return 5.50;
            }
            case MEDIUM -> {
                return 7.00;
            }
            case LARGE -> {
                return 8.50;
            }
            default -> {
                return 0;
            }
        }
    }

    private String toppingString(){ // TODO: Use string format for the double value format
        if(toppings.isEmpty())return "NO MEAT\nNO CHEESE\nNO TOPPINGS\nNO SAUCE\n";
        StringBuilder out = new StringBuilder();
        toppings.forEach(topping -> out.append("\t-ADD ").append(topping.toString()).append("\n"));
        return out.toString();
    }
}
