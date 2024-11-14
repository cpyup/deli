package com.pluralsight.ui.menus.prompts;

import com.pluralsight.ui.menus.Menu;
import java.util.List;

public abstract class Prompt extends Menu {

    @Override
    protected <T> void printEnumOptions(List<T> options){
        for (int i = 0; i < options.size(); i++) {
            System.out.println("\t" + (i+1) + " - "+ formatEnumOption(options.get(i).toString()));
        }
    }
}
