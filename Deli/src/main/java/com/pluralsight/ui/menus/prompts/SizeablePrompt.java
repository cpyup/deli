package com.pluralsight.ui.menus.prompts;

import com.pluralsight.data.options.Size;

public abstract class SizeablePrompt extends Prompt{
    protected Size selectSize(){
        while(true){
            System.out.println("Size Options");

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
