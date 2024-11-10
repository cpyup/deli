package com.pluralsight.interfaces;

public interface IDisplayEnum {
    default <T extends Enum<T>> void displayEnumValues(Class<T> enumClass) {
        T[] enumConstants = enumClass.getEnumConstants();
        for (int i = 0; i < enumConstants.length; i++) {
            T enumConstant = enumConstants[i];
            System.out.println("\t" + (i+1) + " - " + enumConstant.name().replace('_',' '));
        }
    }
}
