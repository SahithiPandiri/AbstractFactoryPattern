package com.example.abstractfactorypattern;


 class ExpensiveVehicleFactory implements VehicleFactory{
    public BasicHumanNeeds getTypeOfVehicle(String s){
        if(s.equalsIgnoreCase("rich")){
            return new RichPerson();
        }
        return null;

     }
}
