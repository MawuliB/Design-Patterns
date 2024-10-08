package com.sns.concrete;

import com.sns.interfaces.Vehicle;

import java.util.logging.Logger;

public class Bicycle implements Vehicle {

    Logger log = Logger.getLogger(Bicycle.class.getName());

    @Override
    public void color() {
        log.info("The color of the bicycle is blue");
    }

    @Override
    public void wheels() {
        log.info("The bicycle has 2 wheels");
    }

    @Override
    public void engine() {
        log.info("The bicycle has no engine");
    }

    @Override
    public void topSpeed() {
        log.info("The bicycle has a top speed of 20mph");
    }
}
