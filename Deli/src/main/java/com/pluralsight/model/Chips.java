package com.pluralsight.model;

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
