package com.pluralsight.ui.menus;

import com.pluralsight.interfaces.IDisplayEnum;

import java.util.List;
import java.util.Scanner;

public abstract class Menu implements IDisplayEnum {
    public static final Scanner scanner = new Scanner(System.in);
    public abstract void displayMenu();

    public <T extends Enum<T>> void printMenuOptions(Class<T> enumClass) {
        List<String> fetchEnumOptions = fetchEnumOptions(enumClass);
        for (int i = 0; i < fetchEnumOptions.size() - 1; i++) {
            String s = fetchEnumOptions.get(i);
            System.out.println("\t" + (i+1) + " - " + s.replace('_', ' '));
        }
        System.out.println("\t0 - " +fetchEnumOptions.get(fetchEnumOptions.size()-1).replace('_',' '));
    }

}
