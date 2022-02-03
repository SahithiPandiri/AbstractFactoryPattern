package com.example.abstractfactorypattern;

public class VehicleProducer {
    VehicleFactory getType(boolean expensive){
        if(expensive)
            return new ExpensiveVehicleFactory();
        else
            return new AffordableVehicleFactory();
    }
}
