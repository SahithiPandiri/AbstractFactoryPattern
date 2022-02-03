package com.example.abstractfactorypattern;

public class FoodGenerator {
    FoodFactory getType(boolean expensive){
        if(expensive){
            return new ExpensiveFoodFactory();
        }
        else{
            return new AffordableFoodFactory();
        }
    }
}
