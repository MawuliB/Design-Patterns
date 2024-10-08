package com.designpattern.factorymethod.factories;

import com.designpattern.factorymethod.concrete.Car;
import com.designpattern.factorymethod.interfaces.Vehicle;
import com.designpattern.factorymethod.mainFactory.VehicleFactory;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
