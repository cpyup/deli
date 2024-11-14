package com.pluralsight.ui.menus;

import com.pluralsight.data.navigation.MenuOptions;
import com.pluralsight.ui.InputHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Menu extends InputHandler {

    public abstract void displayMenu();

    protected List<MenuOptions> getMenuOptions(String type) {
        return MenuOptions.stream().filter(menu -> menu.getType().replace("_", "").equalsIgnoreCase(type))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    protected <T> void printEnumOptions(List<T> options){
        for (int i = 0; i < options.size() - 1; i++) {
            System.out.println("\t" + (i+1) + " - "+options.get(i));
        }
        System.out.println("\t0 - "+ options.get(options.size() - 1));
    }

}
