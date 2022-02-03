package com.example.abstractfactorypattern;

public class RichPerson implements BasicHumanNeeds {
    @Override
    public void getFood() {
        System.out.println("They can afford expensive Food" );
    }
    public void getVehicle(){
        System.out.println("They can afford expensive Vehicles");
    }
}
