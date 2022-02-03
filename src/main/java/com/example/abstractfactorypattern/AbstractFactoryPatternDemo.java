package com.example.abstractfactorypattern;
import java.util.*;
public class AbstractFactoryPatternDemo {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        FoodGenerator generator= new FoodGenerator();
        System.out.println("enter Kind of food and vehicle");
        System.out.println("enter Rich or poor");
        FoodFactory foodType;
        String kind=sc.next();
        if(kind.equals("rich"))
         foodType=generator.getType(true);
        else
            foodType=generator.getType(false);
        BasicHumanNeeds status= foodType.getTypeOfFood(kind);
        status.getFood();
        status.getVehicle();

    }
}
