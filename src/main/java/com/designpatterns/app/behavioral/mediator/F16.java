package com.designpatterns.app.behavioral.mediator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class F16 implements IAircraft {

    ControlTower controlTower;
    public F16(ControlTower controlTower) {
        this.controlTower = controlTower;
    }

    @Override
    public void fly() {
        log.info("F16 is flying");
    }

    @Override
    public void land() {
        log.info("Landing F16");
    }

    public void requestControlTowerToLand() {
        controlTower.requestToLand(this);
    }
}
