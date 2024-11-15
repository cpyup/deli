package com.pluralsight.data.order;

import java.util.stream.Stream;

/**
 * Enum representing additional items that can be added to an order.
 * <p>
 * Each value in this enum represents a specific extra item, such as drinks or chips.
 * The enum associates each item with a type (e.g., "drink" or "chips").
 * </p>
 *
 * <p>For example:</p>
 * <ul>
 *     <li>{@link #MOUNTAIN_SWEAT} - a type of drink.</li>
 *     <li>{@link #DORITOS_NACHO_CHEESE} - a type of chips.</li>
 * </ul>
 *
 * <p>This enum also provides utility methods for interacting with the items:</p>
 * <ul>
 *     <li>{@link #getType()} - Returns the type of the extra item (e.g., "drink", "chips").</li>
 *     <li>{@link #stream()} - Returns a stream of all the enum values.</li>
 * </ul>
 */
public enum OrderExtras {
    MOUNTAIN_SWEAT("drink"),
    BEPIS("drink"),
    DIET_BEPIS("drink"),
    DORITOS_NACHO_CHEESE("chips"),
    DORITOS_COOL_RANCH("chips"),
    SALT_AND_VINEGAR("chips");


    private final String type;

    /**
     * Constructor to associate an extra item with its type.
     *
     * @param type The type of the extra (e.g., "drink" or "chips").
     */
    OrderExtras(String type){
        this.type = type;
    }

    /**
     * Gets the type of the extra item.
     *
     * @return The type of the extra item (e.g., "drink" or "chips").
     */
    public String getType() {
        return type;
    }

    /**
     * Returns a stream of all the enum values.
     *
     * <p>This method allows for easy iteration or other stream operations on all available {@link OrderExtras} values.</p>
     *
     * @return A stream containing all the {@link OrderExtras} values.
     */
    public static Stream<OrderExtras> stream() {
        return Stream.of(OrderExtras.values());
    }
}
