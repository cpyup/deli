package com.pluralsight.ui.menus.prompts;

import com.pluralsight.data.navigation.MenuOptions;
import com.pluralsight.ui.menus.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Prompt extends Menu {

    @Override
    protected <T> void printEnumOptions(List<T> options){
        for (int i = 0; i < options.size(); i++) {
            System.out.println("\t" + (i+1) + " - "+options.get(i));
        }
    }

    protected List<MenuOptions> getMenuOptions(String type) {
        return MenuOptions.stream()
                .filter(menu -> menu.getType().replace("_", "").equalsIgnoreCase(type))
                .collect(Collectors.toCollection(ArrayList::new));
    }


}
