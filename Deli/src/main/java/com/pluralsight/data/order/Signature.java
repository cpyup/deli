package com.pluralsight.data.order;

import java.util.stream.Stream;

public enum Signature {
    BLT("WHITE","MEDIUM","BACON|CHEDDAR|LETTUCE|TOMATO|RANCH","YES"),
    PHILLY_CHEESE_STEAK("WHITE","MEDIUM","STEAK|AMERICAN|PEPPERS|MAYO","YES");

    private final String bread;
    private final String size;
    private final String toppings;
    private final String isToasted;

    Signature(String bread, String size, String toppings, String isToasted){
        this.bread = bread;
        this.size = size;
        this.toppings = toppings;
        this.isToasted = isToasted;
    }

    public String getBread() {
        return bread;
    }

    public String getSize() {
        return size;
    }

    public String getToppings() {
        return toppings;
    }

    public String getIsToasted() {
        return isToasted;
    }

    public static Stream<Signature> stream() {
        return Stream.of(Signature.values());
    }
}
