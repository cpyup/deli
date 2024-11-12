package com.pluralsight.ui.menus.prompts;

import com.pluralsight.ui.menus.Menu;

import java.util.List;

public abstract class Prompt extends Menu {

    protected <T extends Enum<T>> void printPromptOptions(Class<T> enumClass) {
        List<String> fetchEnumOptions = fetchEnumOptions(enumClass);
        for (int i = 0; i < fetchEnumOptions.size(); i++) {
            String s = formatEnumOption(fetchEnumOptions.get(i));
            System.out.println("\t" + (i+1) + " - " + s);
        }
    }
}
