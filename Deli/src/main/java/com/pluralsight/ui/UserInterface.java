package com.pluralsight.ui;

import java.util.Scanner;

public abstract class UserInterface {
    public static final Scanner scanner = new Scanner(System.in);
    public abstract void displayMenu();
}
