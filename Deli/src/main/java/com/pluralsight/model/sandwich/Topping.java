package com.pluralsight.model.sandwich;

import com.pluralsight.data.order.Size;
import com.pluralsight.data.order.ToppingType;
import com.pluralsight.model.interfaces.IGetPrice;

public abstract class Topping implements IGetPrice{
    ToppingType toppingType;
    @Override
    public abstract double getPrice();
    public abstract ToppingType getType();

}
