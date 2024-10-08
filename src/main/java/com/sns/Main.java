package com.sns;

import com.sns.factories.BicycleFactory;
import com.sns.factories.CarFactory;
import com.sns.factories.MotorBikeFactory;
import com.sns.factory.VehicleFactory;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger log = Logger.getLogger(Main.class.getName());

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