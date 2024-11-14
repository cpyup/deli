package com.pluralsight.data.ui;

import java.util.stream.Stream;

public enum MenuOptions {
    NEW_ORDER("main_menu"),
    EXIT("main_menu"),
    ADD_SANDWICH("order_menu"),
    ADD_DRINK("order_menu"),
    ADD_CHIPS("order_menu"),
    CHECKOUT("order_menu"),
    CANCEL_ORDER("order_menu");

    private final String type;

    MenuOptions(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static Stream<MenuOptions> stream() {
        return Stream.of(MenuOptions.values());
    }
}
