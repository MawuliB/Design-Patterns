package com.sns.concrete;

import com.sns.interfaces.Vehicle;

import java.util.logging.Logger;

public class Car implements Vehicle {

    Logger log = Logger.getLogger(Car.class.getName());

    @Override
    public void color() {
        log.info("The color of the car is red");
    }

    @Override
    public void wheels() {
        log.info("The car has 4 wheels");
    }

    @Override
    public void engine() {
        log.info("The car has a V8 engine");
    }

    @Override
    public void topSpeed() {
        log.info("The car has a top speed of 200mph");
    }
}
