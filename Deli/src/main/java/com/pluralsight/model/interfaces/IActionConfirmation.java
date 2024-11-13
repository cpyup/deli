package com.pluralsight.model.interfaces;

public interface IActionConfirmation {
    void confirmContinue(String displayMessage);
    boolean cancelOrContinue(String displayMessage);
}
