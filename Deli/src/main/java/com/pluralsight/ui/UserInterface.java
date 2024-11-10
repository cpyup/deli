package com.pluralsight.ui;

import com.pluralsight.interfaces.IDisplayEnum;

import java.util.Scanner;

public abstract class UserInterface implements IDisplayEnum {
    public static final Scanner scanner = new Scanner(System.in);
    public abstract void displayMenu();
    public abstract void handleMenuInput();
    
}
