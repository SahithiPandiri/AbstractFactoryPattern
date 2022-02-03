package com.example.abstractfactorypattern;

public class ExpensiveFoodFactory implements FoodFactory{
    public BasicHumanNeeds getTypeOfFood(String s){
        if(s.equalsIgnoreCase("Rich")){
            return new RichPerson();
        }
        return null;
    }
}
