package com.pluralsight.ui.menus.prompts;

import com.pluralsight.data.options.OrderExtras;
import com.pluralsight.model.extras.Chips;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    private OrderExtras selectChips(){
        List<OrderExtras> chips = getChipOptions("Chips");
        while (true){
            try{
                printEnumOptions(chips);
                String input = getStringInput("\nSelect Desired Chips: ");

                int i = Integer.parseInt(input);

                if(i > 0 && i <= chips.size()){
                    return chips.get(i);
                }
                throw new NumberFormatException("Invalid Input");
            }catch(NumberFormatException e){
                System.out.println("Invalid Input");
            }
        }
    }

    protected List<OrderExtras> getChipOptions(String type) {
        return OrderExtras.stream()
                .filter(chip -> chip.getType().replace("_", "").equalsIgnoreCase(type))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public String toString(){
        return chips.toString();
    }
}
