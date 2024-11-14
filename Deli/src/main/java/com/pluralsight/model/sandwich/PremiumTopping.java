package com.pluralsight.model.sandwich;

import com.pluralsight.data.order.Size;
import com.pluralsight.data.order.ToppingType;
import com.pluralsight.model.interfaces.IHasSizing;

public abstract class PremiumTopping extends Topping implements IHasSizing {
    Size size;
    ToppingType toppingType;
    public PremiumTopping(ToppingType toppingType,Size size) {
        this.toppingType = toppingType;
        this.size = size;
    }

    @Override
    public String toString(){
        return String.format("%s +$%.2f",toppingType.name().replaceAll("_"," "),getPrice());
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }


}
