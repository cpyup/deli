package com.pluralsight.model;

import com.pluralsight.model.menu.ChipType;

public class Chips implements IGetPrice{
    private ChipType chipType;

    public Chips(ChipType chipType){
        this.chipType = chipType;
    }

    @Override
    public double getPrice() {
        return 1.50;
    }
}
