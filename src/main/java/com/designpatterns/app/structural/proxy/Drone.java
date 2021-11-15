package com.designpatterns.app.structural.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Drone implements IDrone {

    @Override
    public void turnLeft() {
        log.info("turning left");
    }

    @Override
    public void turnRight() {
        log.info("turning right");
    }

    @Override
    public void fireMissile() {
        log.info("firing the missile");
    }
}
