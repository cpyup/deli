package com.pluralsight.ui.menus;

import com.pluralsight.ui.InputHandler;
import java.util.List;

public abstract class Menu extends InputHandler {

    public abstract void displayMenu();

    protected <T extends Enum<T>> void printMenuOptions(Class<T> enumClass) {
        List<String> fetchEnumOptions = fetchEnumOptions(enumClass);
        for (int i = 0; i < fetchEnumOptions.size() - 1; i++) {
            String s = formatEnumOption(fetchEnumOptions.get(i));
            System.out.println("\t" + (i+1) + " - " + s);
        }
        System.out.println("\t0 - " + formatEnumOption(fetchEnumOptions.get(fetchEnumOptions.size() - 1)));
    }

}
