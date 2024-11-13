package com.pluralsight.ui;

import com.pluralsight.model.interfaces.IActionConfirmation;
import com.pluralsight.model.interfaces.IGetUserInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class InputHandler implements IGetUserInput, IActionConfirmation {
    protected static final Scanner scanner = new Scanner(System.in);

    @Override
    public void confirmContinue(String displayMessage) {
        System.out.println(displayMessage);
        scanner.nextLine();
    }

    @Override
    public boolean cancelOrContinue(String displayMessage){
        System.out.println("Press Enter To Continue " + displayMessage + " Or Enter 'X' To Cancel ");
        String input = scanner.nextLine().trim();
        return !input.equalsIgnoreCase("x");
    }

    @Override
    public String getStringInput(String displayMessage) {
        if(!displayMessage.isBlank())System.out.print(displayMessage);
        return scanner.nextLine().trim();
    }

    protected String formatEnumOption(String option) {
        return option.replace('_', ' ');
    }

    protected <T extends Enum<T>> List<String> fetchEnumOptions(Class<T> enumClass) {
        T[] enumConstants = enumClass.getEnumConstants();
        List<String> out = new ArrayList<>();
        for (T enumConstant : enumConstants) {
            out.add(enumConstant.name());
        }
        return out;
    }
}
