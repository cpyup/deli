package com.pluralsight.ui;

public interface IGetUserInput {
    String getStringInput(String displayMessage);
    void confirmContinue(String displayMessage);
    boolean cancelOrContinue(String displayMessage);
}
