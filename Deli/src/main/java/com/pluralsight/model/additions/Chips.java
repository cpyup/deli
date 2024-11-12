package com.pluralsight.model.additions;

import com.pluralsight.data.options.ChipType;
import com.pluralsight.model.order.OrderItem;

public class Chips extends OrderItem {
    private final ChipType chipType;

    public Chips(ChipType chipType){
        this.chipType = chipType;
    }

    @Override
    public double getPrice() {
        return 1.50;
    }
}
