package com.pluralsight.data.order;

import java.util.stream.Stream;

public enum Size {
    SMALL,
    MEDIUM,
    LARGE;

    public static Stream<Size> stream() {
        return Stream.of(Size.values());
    }
}
