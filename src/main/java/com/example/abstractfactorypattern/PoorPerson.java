package com.example.abstractfactorypattern;

public class PoorPerson implements BasicHumanNeeds{
    public void getFood(){
        System.out.println("They cannot afford expensive Food");
    }
    public void getVehicle(){
        System.out.println("They cannot afford expensive Vehicles");
    }

}
