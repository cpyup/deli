package com.pluralsight.model.sandwich;

import com.pluralsight.data.options.Size;

public abstract class PremiumTopping extends Topping {
    Size size;
    public PremiumTopping(String name, Size size) {
        super(name);
        this.size = size;
    }


}
