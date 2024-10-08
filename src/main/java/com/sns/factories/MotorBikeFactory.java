package com.sns.factories;

import com.sns.concrete.MotorBike;
import com.sns.factory.VehicleFactory;
import com.sns.interfaces.Vehicle;

public class MotorBikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new MotorBike();
    }
}
