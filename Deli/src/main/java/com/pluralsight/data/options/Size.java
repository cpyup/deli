package com.pluralsight.data.options;

import java.util.stream.Stream;

public enum Size {
    SMALL,
    MEDIUM,
    LARGE;

    public static Stream<Size> stream() {
        return Stream.of(Size.values());
    }
}
