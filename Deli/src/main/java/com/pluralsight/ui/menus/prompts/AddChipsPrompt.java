package com.pluralsight.ui.menus.prompts;

import com.pluralsight.data.options.ChipType;
import com.pluralsight.model.additions.Chips;

public class AddChipsPrompt extends Prompt{
    private Chips chips;

    public AddChipsPrompt(){
        this.chips = null;
    }

    public Chips getChips(){
        return chips;
    }

    public void setChips(Chips chips){
        this.chips = chips;
    }

    @Override
    public void displayMenu() {
        System.out.println("Add New Chips");
        setChips(new Chips(selectChips()));
    }

    private ChipType selectChips(){
        while (true){
            printMenuOptions(ChipType.class);
            String input = getStringInput("\nSelect Desired Drink: ");

            switch (input){
                case "1" -> {
                    return ChipType.DORITOS_NACHO_CHEESE;
                }
                case "2" -> {
                    return ChipType.DORITOS_COOL_RANCH;
                }
                case "3" -> {
                    return ChipType.SALT_AND_VINEGAR;
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }

    @Override
    public String toString(){
        return chips.toString();
    }
}
