package com.pluralsight.data.options;

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
    TOMATOES("regular_topping"),
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
    VINAIGRETTE("sauce");

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
