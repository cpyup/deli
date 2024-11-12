package com.pluralsight.ui.menus;

import com.pluralsight.ui.UserInterface;

public class MainMenu extends UserInterface {
    @Override
    public <T extends Enum<T>> void displayMenu(Class<T> enumClass) {
        System.out.println("Main Menu\nOptions:");
        super.displayMenu(enumClass);
    }

    @Override
    public void handleOptions() {

    }


}
