package com.pluralsight.ui.menus.prompts;

import com.pluralsight.data.order.Size;
import com.pluralsight.ui.menus.Menu;
import java.util.List;

public abstract class Prompt extends Menu {
    @Override
    protected <T> void printEnumOptions(List<T> options){
        for (int i = 0; i < options.size(); i++) {
            System.out.println("\t" + (i+1) + " - "+ formatEnumOption(options.get(i).toString()));
        }
    }

    public Size selectSize(){
        while(true){
            System.out.println("\nSize Options");

            printEnumOptions(Size.stream().toList());

            String input = getStringInput("\nSelect Desired Size: ");

            switch(input){
                case "1" -> {
                    return Size.SMALL;
                }
                case "2" -> {
                    return Size.MEDIUM;
                }
                case "3" -> {
                    return Size.LARGE;
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }
}
