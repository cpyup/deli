package com.pluralsight.ui.menus.prompts;

import com.pluralsight.model.sandwich.*;

public class EditSandwichPrompt extends AddSandwichPrompt{

    public EditSandwichPrompt(Sandwich sandwich){
        this.sandwich = sandwich;
        this.size = sandwich.getSize();
        this.toppings = sandwich.getToppings();
    }

    @Override
    public void displayMenu(){ // TODO: Provide options for editing selected sandwiches attributes
        displayMenuOptions();
    }

    private void displayMenuOptions(){
        while (true){
            System.out.println("\nSelected Sandwich:\n"+sandwich+
                    "\nEdit Sandwich\nOptions:\n\t1 - Change Bread\n\t2 - Change Size\n\t3 - Add/Remove Meat\n\t4 - Add/Remove Cheese\n\t5 - Add/Remove Topping\n\t6 - Add/Remove Sauce\n\t7 - Modify Toasted\n\t0 - Finish Editing");
            String input = getStringInput("Enter Desired Option: ");

            switch(input){
                case "1" -> sandwich.setBreadType(selectBread());
                case "2" -> sandwich.setSize(selectSize());
                case "3" -> sandwich.setToppings(addTopping(Meat.class,sandwich.getToppings().stream().filter(topping -> topping.getType().getType().equalsIgnoreCase("meat")).toList()));
                case "4" -> toppings = addTopping(Cheese.class,toppings.stream().filter(topping -> topping instanceof Cheese).toList());
                case "5" -> toppings = addTopping(RegularTopping.class,toppings.stream().filter(topping -> topping instanceof RegularTopping).toList());
                case "6" -> toppings = addTopping(Sauce.class,toppings.stream().filter(topping -> topping instanceof Sauce).toList());
                case "7" -> sandwich.setToasted(getStringInput("Toasted? (Yes/No): ").equalsIgnoreCase("yes"));
                case "0" -> {
                    return;
                }
                default -> System.out.println("Input Error");
            }
        }
        }
}
