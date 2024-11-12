package com.pluralsight.interfaces;

import java.util.ArrayList;
import java.util.List;

public interface IDisplayEnum {
    default <T extends Enum<T>> List<String> fetchEnumOptions(Class<T> enumClass) {
        T[] enumConstants = enumClass.getEnumConstants();
        List<String> out = new ArrayList<>();
        for (T enumConstant : enumConstants) {
            out.add(enumConstant.name());
        }
        return out;
    }
}
