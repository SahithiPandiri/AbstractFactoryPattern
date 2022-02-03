package com.example.abstractfactorypattern;

class AffordableVehicleFactory implements VehicleFactory {
    public BasicHumanNeeds getTypeOfVehicle(String s){
        if(s.equalsIgnoreCase("poor")){
            return new PoorPerson();
        }
        return null;
    }
}
