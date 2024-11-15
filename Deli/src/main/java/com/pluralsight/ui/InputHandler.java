package com.pluralsight.ui;

import java.util.Scanner;

public abstract class InputHandler implements IGetUserInput { //TODO: THIS NEEDS REMOVED, FUNCTIONS IMPLEMENTED DIRECTLY IN MENU ABSTRACT
    protected static final Scanner scanner = new Scanner(System.in);

    @Override
    public void confirmContinue(String displayMessage) {
        System.out.println(displayMessage);
        scanner.nextLine();
    }

    @Override
    public boolean cancelOrContinue(String displayMessage){
        System.out.println("Press Enter To Continue " + displayMessage + " Or Type 'X' To Cancel: ");
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
}
