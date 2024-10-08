package com.designpattern.factorymethod.factories;

import com.designpattern.factorymethod.concrete.MotorBike;
import com.designpattern.factorymethod.interfaces.Vehicle;
import com.designpattern.factorymethod.mainFactory.VehicleFactory;

public class MotorBikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new MotorBike();
    }
}
