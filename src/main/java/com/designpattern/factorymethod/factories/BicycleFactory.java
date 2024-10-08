package com.designpattern.factorymethod.factories;

import com.designpattern.factorymethod.concrete.Bicycle;
import com.designpattern.factorymethod.interfaces.Vehicle;
import com.designpattern.factorymethod.mainFactory.VehicleFactory;

public class BicycleFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Bicycle();
    }
}
