package com.pluralsight.data.ui;

import java.util.stream.Stream;

/**
 * Enum representing the available menu options in the user interface.
 * <p>
 * This enum defines various menu options for the application, grouped into categories like
 * the main menu and order menu. Each menu option corresponds to a specific action that the user can take
 * in the UI.
 * </p>
 *
 * <p>For example:</p>
 * <ul>
 *     <li>{@link #NEW_ORDER} - A menu option to create a new order (main menu).</li>
 *     <li>{@link #ADD_CUSTOM_SANDWICH} - A menu option to add a custom sandwich to the order (order menu).</li>
 *     <li>{@link #CHECKOUT} - A menu option to proceed with the checkout (order menu).</li>
 * </ul>
 *
 * <p>This enum also provides utility methods for interacting with menu options:</p>
 * <ul>
 *     <li>{@link #getType()} - Returns the category (type) of the menu option (e.g., "main_menu", "order_menu").</li>
 *     <li>{@link #stream()} - Returns a stream of all available menu options.</li>
 * </ul>
 */
public enum MenuOptions {
    NEW_ORDER("main_menu"),
    EXIT("main_menu"),
    ADD_CUSTOM_SANDWICH("order_menu"),
    ADD_SIGNATURE_SANDWICH("order_menu"),
    ADD_DRINK("order_menu"),
    ADD_CHIPS("order_menu"),
    CHECKOUT("order_menu"),
    CANCEL_ORDER("order_menu");

    private final String type;

    /**
     * Constructor to associate a menu option with its category.
     *
     * @param type The category of the menu option (e.g., "main_menu", "order_menu").
     */
    MenuOptions(String type){
        this.type = type;
    }

    /**
     * Gets the category type of the menu option.
     *
     * @return The category type of the menu option (e.g., "main_menu", "order_menu").
     */
    public String getType() {
        return type;
    }

    /**
     * Returns a stream of all available menu options.
     *
     * <p>This method allows for easy iteration or other stream operations on all available {@link MenuOptions} values.</p>
     *
     * @return A stream containing all the {@link MenuOptions} values.
     */
    public static Stream<MenuOptions> stream() {
        return Stream.of(MenuOptions.values());
    }
}
