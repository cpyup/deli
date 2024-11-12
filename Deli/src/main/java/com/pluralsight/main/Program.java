package com.pluralsight.main;

import com.pluralsight.data.navigation.MainMenuOptions;
import com.pluralsight.ui.menus.MainMenu;

public class Program {
    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.displayMenu(MainMenuOptions.class);
    }
}
