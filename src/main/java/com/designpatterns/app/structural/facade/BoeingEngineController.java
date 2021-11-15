package com.designpatterns.app.structural.facade;

public class BoeingEngineController {
    private int engineSpeed = 0;
    public void setEngineSpeed(int engineSpeed) {
        this.engineSpeed = engineSpeed;
    }

    public int getEngineSpeed() {
        return engineSpeed;
    }

    public void turnOff() {
    }
}
