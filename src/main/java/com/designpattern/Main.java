package com.designpattern;

import com.designpattern.factorymethod.factories.BicycleFactory;
import com.designpattern.factorymethod.factories.CarFactory;
import com.designpattern.factorymethod.factories.MotorBikeFactory;
import com.designpattern.factorymethod.mainFactory.VehicleFactory;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger log = Logger.getLogger(Main.class.getName());
        //Factory Method
        VehicleFactory vehicle1 = new CarFactory();
        vehicle1.printDetails();
        log.warning("\n\n");
        VehicleFactory vehicle2 = new MotorBikeFactory();
        vehicle2.printDetails();
        log.warning("\n\n");
        VehicleFactory vehicle3 = new BicycleFactory();
        vehicle3.printDetails();
    }
}