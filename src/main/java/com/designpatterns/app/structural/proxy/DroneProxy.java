package com.designpatterns.app.structural.proxy;

public class DroneProxy implements IDrone {

    @Override
    public void turnLeft() {
        //forward the request to the real drone over network
    }

    @Override
    public void turnRight() {
        //forward the request to the real drone over network
    }

    @Override
    public void fireMissile() {
        //forward the request to the real drone over network
    }
}
