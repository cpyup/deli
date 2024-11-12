package com.pluralsight.model.order;

import com.pluralsight.interfaces.IGetPrice;

public abstract class OrderItem implements IGetPrice {
    @Override
    public abstract double getPrice();
}
