package com.pluralsight.ui.menus.prompts;

import com.pluralsight.data.order.OrderExtras;
import com.pluralsight.model.extras.Drink;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddDrinkPrompt extends SizeablePrompt{
    private Drink drink;

    public AddDrinkPrompt(){
        this.drink = null;
    }

    @Override
    public void displayMenu() {
        System.out.println("Add New Drink");
        setDrink();
    }

    public Drink getDrink(){
        return drink;
    }

    private void setDrink(){
        this.drink = new Drink(selectDrink(),selectSize());
    }

    private OrderExtras selectDrink(){
        List<OrderExtras> drinks = getDrinkOptions("Drink");
        while (true){
            try{
                printEnumOptions(drinks);
                String input = getStringInput("\nSelect Desired Drink: ");

                int i = Integer.parseInt(input);

                if(i > 0 && i <= drinks.size()){
                    return drinks.get(i);
                }
                throw new NumberFormatException("Invalid Input");
            }catch(NumberFormatException e){
                System.out.println("Invalid Input");
            }
        }
    }

    protected List<OrderExtras> getDrinkOptions(String type) {
        return OrderExtras.stream()
                .filter(chip -> chip.getType().replace("_", "").equalsIgnoreCase(type))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
