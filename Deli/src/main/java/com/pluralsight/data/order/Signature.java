package com.pluralsight.data.order;

import java.util.stream.Stream;

/**
 * Enum representing predefined sandwich combinations.
 * <p>
 * Each value in this enum represents a specific sandwich, including the type of bread,
 * sandwich size, toppings, and whether the sandwich is toasted or not.
 * </p>
 *
 * <p>For example:</p>
 * <ul>
 *     <li>{@link #BLT} - A BLT sandwich with white bread, medium size, and toppings of bacon, cheddar, lettuce, tomato, and ranch, toasted.</li>
 *     <li>{@link #PHILLY_CHEESE_STEAK} - A Philly Cheese Steak sandwich with white bread, medium size, and toppings of steak, American cheese, peppers, and mayo, toasted.</li>
 * </ul>
 *
 * <p>This enum also provides utility methods for interacting with the sandwich signatures:</p>
 * <ul>
 *     <li>{@link #getBread()} - Returns the type of bread used in the sandwich.</li>
 *     <li>{@link #getSize()} - Returns the size of the sandwich (e.g., "medium").</li>
 *     <li>{@link #getToppings()} - Returns a string representation of the toppings on the sandwich (e.g., "BACON|CHEDDAR|LETTUCE|TOMATO|RANCH").</li>
 *     <li>{@link #getIsToasted()} - Indicates whether the sandwich is toasted ("YES" or "NO").</li>
 *     <li>{@link #stream()} - Returns a stream of all the enum values.</li>
 * </ul>
 */
public enum Signature {
    BLT("WHITE","MEDIUM","BACON|CHEDDAR|LETTUCE|TOMATO|RANCH","YES"),
    PHILLY_CHEESE_STEAK("WHITE","MEDIUM","STEAK|AMERICAN|PEPPERS|MAYO","YES");

    private final String bread;
    private final String size;
    private final String toppings;
    private final String isToasted;

    /**
     * Constructor to create a sandwich with specific bread, size, toppings, and toasting preference.
     *
     * @param bread The type of bread used for the sandwich (e.g., "WHITE", "WHEAT").
     * @param size The size of the sandwich (e.g., "SMALL", "MEDIUM", "LARGE").
     * @param toppings A pipe-delimited string representing the toppings (e.g., "BACON|LETTUCE|TOMATO").
     * @param isToasted Indicates whether the sandwich is toasted ("YES" or "NO").
     */
    Signature(String bread, String size, String toppings, String isToasted){
        this.bread = bread;
        this.size = size;
        this.toppings = toppings;
        this.isToasted = isToasted;
    }

    /**
     * Gets the type of bread used for the sandwich.
     *
     * @return The type of bread (e.g., "WHITE", "WHEAT").
     */
    public String getBread() {
        return bread;
    }

    /**
     * Gets the size of the sandwich.
     *
     * @return The size of the sandwich (e.g., "MEDIUM").
     */
    public String getSize() {
        return size;
    }

    /**
     * Gets the toppings for the sandwich.
     *
     * @return A pipe-delimited string of toppings (e.g., "BACON|CHEDDAR|LETTUCE|TOMATO").
     */
    public String getToppings() {
        return toppings;
    }

    /**
     * Indicates whether the sandwich is toasted.
     *
     * @return "YES" if the sandwich is toasted, "NO" if it is not.
     */
    public String getIsToasted() {
        return isToasted;
    }

    /**
     * Returns a stream of all the sandwich enum values.
     *
     * <p>This method allows for easy iteration or other stream operations on all available {@link Signature} values.</p>
     *
     * @return A stream containing all the {@link Signature} values.
     */
    public static Stream<Signature> stream() {
        return Stream.of(Signature.values());
    }
}
