package com.pluralsight.model.sandwich.signature;

import com.pluralsight.data.order.Signature;
import com.pluralsight.data.order.Size;
import com.pluralsight.data.order.ToppingType;
import com.pluralsight.model.sandwich.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SignatureSandwich extends Sandwich {
    private final String name;

    public SignatureSandwich(Signature sigData){
        super(null,null,null,true);
        this.name = sigData.name().replaceAll("_"," ");
        init(sigData);
    }

    @Override
    public String toString(){
        return String.format("%n%s%n-%s %s %s +$%.2f%n%s", name.toUpperCase(),
                size.toString(), breadType.toString(), (isToasted ? "[TOASTED]" : ""), getBreadPrice(), toppingString());
    }

    private void init(Signature sigData){
        this.breadType = parseBreadString(sigData.getBread());
        this.size = parseSizeString(sigData.getSize());
        setToppings(parseToppingString(sigData.getToppings()));
        this.isToasted = (sigData.getIsToasted().equalsIgnoreCase("YES"));
    }

    private ToppingType parseBreadString(String breadString){
        for(ToppingType toppingType : ToppingType.values()){
            if(toppingType.name().equalsIgnoreCase(breadString)){
                return toppingType;
            }
        }
        return null;
    }

    private Size parseSizeString(String sizeString){
        for(Size pSize : Size.values()){
            if(pSize.toString().equalsIgnoreCase(sizeString)){
                return pSize;
            }
        }
        return null;
    }

    private List<Topping> parseToppingString(String toppingString){
        String[] toppingNames = toppingString.split("\\|");
        List<Topping> toppingList = new ArrayList<>();

        for(String tString : toppingNames){

            // TODO: Move to private method, have it return value to thisType
            ToppingType thisType = Arrays.stream(ToppingType.values())
                    .filter(toppingType -> toppingType.toString().equalsIgnoreCase(tString))
                    .findFirst()
                    .orElse(null);

            if(thisType != null){
                switch (thisType.getType()){
                    case "meat" -> toppingList.add(new Meat(thisType,size));
                    case "cheese" -> toppingList.add(new Cheese(thisType,size));
                    case "regular_topping" -> toppingList.add(new RegularTopping(thisType));
                    case "sauce" -> toppingList.add(new Sauce(thisType));
                }
            }else{
                throw new RuntimeException("Error Parsing Topping");
            }
        }
        return toppingList;
    }


}
