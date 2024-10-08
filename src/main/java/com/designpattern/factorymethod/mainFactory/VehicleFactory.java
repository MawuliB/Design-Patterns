package com.designpattern.factorymethod.mainFactory;

import com.designpattern.factorymethod.interfaces.Vehicle;

import java.util.logging.Logger;

public abstract class VehicleFactory {

    Logger log = Logger.getLogger(VehicleFactory.class.getName());

    public abstract Vehicle createVehicle();

    public void printDetails() {
        Vehicle vehicle = createVehicle();
        log.info("Vehicle: " + vehicle.getClass().getSimpleName() + "\n");
        vehicle.color();
        vehicle.wheels();
        vehicle.engine();
        vehicle.topSpeed();
    }
}
