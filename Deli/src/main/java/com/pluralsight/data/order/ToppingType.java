package com.pluralsight.data.order;

import java.util.stream.Stream;

public enum ToppingType {
    STEAK("meat"),
    HAM("meat"),
    SALAMI("meat"),
    ROAST_BEEF("meat"),
    CHICKEN("meat"),
    BACON("meat"),
    AMERICAN("cheese"),
    PROVOLONE("cheese"),
    CHEDDAR("cheese"),
    SWISS("cheese"),
    LETTUCE("regular_topping"),
    PEPPERS("regular_topping"),
    ONIONS("regular_topping"),
    TOMATO("regular_topping"),
    JALEPENOS("regular_topping"),
    CUCUMBERS("regular_topping"),
    PICKLES("regular_topping"),
    GUACAMOLE("regular_topping"),
    MUSHROOMS("regular_topping"),
    MAYO("sauce"),
    MUSTARD("sauce"),
    KETCHUP("sauce"),
    RANCH("sauce"),
    THOUSAND_ISLAND("sauce"),
    VINAIGRETTE("sauce"),
    WHITE("bread"),
    WHEAT("bread"),
    RYE("bread"),
    WRAP("bread");

    private final String type;

    ToppingType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static Stream<ToppingType> stream() {
        return Stream.of(ToppingType.values());
    }
}
