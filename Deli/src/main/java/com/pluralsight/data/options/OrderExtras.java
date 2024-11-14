package com.pluralsight.data.options;

import java.util.stream.Stream;

public enum OrderExtras {
    MOUNTAIN_SWEAT("drink"),
    BEPIS("drink"),
    DIET_BEPIS("drink"),
    DORITOS_NACHO_CHEESE("chips"),
    DORITOS_COOL_RANCH("chips"),
    SALT_AND_VINEGAR("chips");

    private final String type;

    OrderExtras(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static Stream<OrderExtras> stream() {
        return Stream.of(OrderExtras.values());
    }
}
