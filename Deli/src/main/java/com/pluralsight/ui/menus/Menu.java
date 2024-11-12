package com.pluralsight.ui.menus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Menu {
    public static final Scanner scanner = new Scanner(System.in);
    public abstract void displayMenu();

    protected <T extends Enum<T>> List<String> fetchEnumOptions(Class<T> enumClass) {
        T[] enumConstants = enumClass.getEnumConstants();
        List<String> out = new ArrayList<>();
        for (T enumConstant : enumConstants) {
            out.add(enumConstant.name());
        }
        return out;
    }

    protected String formatEnumOption(String option) {
        return option.replace('_', ' ');
    }

    public <T extends Enum<T>> void printMenuOptions(Class<T> enumClass) {
        List<String> fetchEnumOptions = fetchEnumOptions(enumClass);
        for (int i = 0; i < fetchEnumOptions.size() - 1; i++) {
            String s = formatEnumOption(fetchEnumOptions.get(i));
            System.out.println("\t" + (i+1) + " - " + s);
        }
        System.out.println("\t0 - " + formatEnumOption(fetchEnumOptions.get(fetchEnumOptions.size() - 1)));
    }

}
