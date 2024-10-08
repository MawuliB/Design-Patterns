package com.sns.factories;

import com.sns.concrete.Bicycle;
import com.sns.factory.VehicleFactory;
import com.sns.interfaces.Vehicle;

public class BicycleFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Bicycle();
    }
}
