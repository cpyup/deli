package com.pluralsight.ui.menus;

import com.pluralsight.data.navigation.MainMenuOptions;
import com.pluralsight.ui.UserInterface;

import java.util.List;

public class MainMenu extends UserInterface {
    @Override
    public void displayMenu() {
        System.out.println("Main Menu\nOptions:");
        List<String> fetchEnumOptions = fetchEnumOptions(MainMenuOptions.class);
        for (int i = fetchEnumOptions.size() - 1; i >= 0; i--) {
            String s = fetchEnumOptions.get(i);
            System.out.println("\t" + i + " - " + s.replace('_', ' '));
        }
    }

    @Override
    public void handleOptions() {

    }


}
