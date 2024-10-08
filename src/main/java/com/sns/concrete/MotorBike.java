package com.sns.concrete;

import com.sns.interfaces.Vehicle;

import java.util.logging.Logger;

public class MotorBike implements Vehicle {

    Logger log = Logger.getLogger(MotorBike.class.getName());

    @Override
    public void color() {
        log.info("The color of the motorbike is black");
    }

    @Override
    public void wheels() {
        log.info("The motorbike has 2 wheels");
    }

    @Override
    public void engine() {
        log.info("The motorbike has a V4 engine");
    }

    @Override
    public void topSpeed() {
        log.info("The motorbike has a top speed of 150mph");
    }
}
