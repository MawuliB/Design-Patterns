package com.sns.factories;

import com.sns.concrete.Car;
import com.sns.factory.VehicleFactory;
import com.sns.interfaces.Vehicle;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
