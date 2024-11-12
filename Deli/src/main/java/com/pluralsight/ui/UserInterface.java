package com.pluralsight.ui;

import com.pluralsight.data.navigation.MainMenuOptions;
import com.pluralsight.interfaces.IDisplayEnum;

import java.util.List;
import java.util.Scanner;

public abstract class UserInterface implements IDisplayEnum {
    public static final Scanner scanner = new Scanner(System.in);
    public abstract void handleOptions();

    public <T extends Enum<T>> void displayMenu(Class<T> enumClass) {
        List<String> fetchEnumOptions = fetchEnumOptions(enumClass);
        for (int i = 0; i < fetchEnumOptions.size() - 1; i++) {
            String s = fetchEnumOptions.get(i);
            System.out.println("\t" + (i+1) + " - " + s.replace('_', ' '));
        }
        System.out.println("\t0 - " +fetchEnumOptions.get(fetchEnumOptions.size()-1).replace('_',' '));
    }

}
