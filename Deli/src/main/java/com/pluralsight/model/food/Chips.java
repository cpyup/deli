package com.pluralsight.model.food;

import com.pluralsight.data.options.ChipType;
import com.pluralsight.interfaces.IGetPrice;

public class Chips implements IGetPrice {
    private ChipType chipType;

    public Chips(ChipType chipType){
        this.chipType = chipType;
    }

    @Override
    public double getPrice() {
        return 1.50;
    }
}
