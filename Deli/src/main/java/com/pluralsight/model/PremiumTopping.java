package com.pluralsight.model;

import com.pluralsight.data.Size;

public abstract class PremiumTopping extends Topping {
    Size size;
    public PremiumTopping(String name, Size size) {
        super(name);
    }

}
