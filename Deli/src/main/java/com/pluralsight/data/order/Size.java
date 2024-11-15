package com.pluralsight.data.order;

import java.util.stream.Stream;

/**
 * Enum representing the sizes available for an order.
 * <p>
 * This enum provides the different sizes of an order, which can be SMALL, MEDIUM, or LARGE.
 * It can be used in conjunction with other order-related data to define the size of an item.
 * </p>
 *
 * <p>For example:</p>
 * <ul>
 *     <li>{@link #SMALL} - Represents a small size order.</li>
 *     <li>{@link #MEDIUM} - Represents a medium size order.</li>
 *     <li>{@link #LARGE} - Represents a large size order.</li>
 * </ul>
 *
 * <p>This enum also provides utility methods for interacting with size values:</p>
 * <ul>
 *     <li>{@link #stream()} - Returns a stream of all available sizes.</li>
 * </ul>
 */
public enum Size {
    SMALL,
    MEDIUM,
    LARGE;

    /**
     * Returns a stream of all the enum values for the available sizes.
     *
     * <p>This method allows for easy iteration or other stream operations on all available {@link Size} values.</p>
     *
     * @return A stream containing all the {@link Size} values.
     */
    public static Stream<Size> stream() {
        return Stream.of(Size.values());
    }
}
