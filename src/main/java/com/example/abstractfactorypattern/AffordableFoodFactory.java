package com.example.abstractfactorypattern;

 class AffordableFoodFactory implements FoodFactory{
     @Override
     public BasicHumanNeeds getTypeOfFood(String s) {
         if(s.equalsIgnoreCase("poor")){
             return new PoorPerson();
         }
         return null;
     }
 }
