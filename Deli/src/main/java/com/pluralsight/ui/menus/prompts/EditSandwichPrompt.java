package com.pluralsight.ui.menus.prompts;

import com.pluralsight.model.sandwich.Sandwich;

public class EditSandwichPrompt extends AddSandwichPrompt{

    public EditSandwichPrompt(Sandwich sandwich){
        this.sandwich = sandwich;
        this.size = sandwich.getSize();
        this.toppings = sandwich.getToppings();
    }

    @Override
    public void displayMenu(){ // TODO: Provide options for editing selected sandwiches attributes

    }
}
