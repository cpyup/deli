package com.pluralsight.model.sandwich;

import com.pluralsight.model.interfaces.IGetPrice;

public abstract class Topping implements IGetPrice{
    @Override
    public abstract double getPrice();

}
