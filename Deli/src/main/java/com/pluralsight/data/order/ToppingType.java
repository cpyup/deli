package com.pluralsight.data.order;

import java.util.stream.Stream;

/**
 * Enum representing the various types of toppings available for an order.
 * <p>
 * This enum defines the different categories of toppings that can be added to an order, including
 * types of meats, cheeses, regular toppings, sauces, and bread options. Each topping type is associated
 * with a category, such as "meat", "cheese", "sauce", or "bread".
 * </p>
 *
 * <p>For example:</p>
 * <ul>
 *     <li>{@link #STEAK} - A type of meat topping.</li>
 *     <li>{@link #AMERICAN} - A type of cheese topping.</li>
 *     <li>{@link #MAYO} - A type of sauce topping.</li>
 *     <li>{@link #WHITE} - A type of bread option.</li>
 * </ul>
 *
 * <p>This enum also provides utility methods for interacting with topping types:</p>
 * <ul>
 *     <li>{@link #getType()} - Returns the category type of the topping (e.g., "meat", "cheese").</li>
 *     <li>{@link #stream()} - Returns a stream of all available topping types.</li>
 * </ul>
 */
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

    /**
     * Constructor to associate a topping with its category.
     *
     * @param type The category of the topping (e.g., "meat", "cheese", "sauce", "bread").
     */
    ToppingType(String type){
        this.type = type;
    }

    /**
     * Gets the category type of the topping.
     *
     * @return The category type of the topping (e.g., "meat", "cheese", "sauce", "bread").
     */
    public String getType() {
        return type;
    }

    /**
     * Returns a stream of all available topping types.
     *
     * <p>This method allows for easy iteration or other stream operations on all available {@link ToppingType} values.</p>
     *
     * @return A stream containing all the {@link ToppingType} values.
     */
    public static Stream<ToppingType> stream() {
        return Stream.of(ToppingType.values());
    }
}
