package com.designpatterns.app.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Boeing747 implements IAircraft{
    @Override
    public void fly() {
        log.info("Boeing 747 is flying");
    }

    @Override
    public void land() {
        log.info("Boeing is landing");
    }

    @Override
    public float getWeight() {
        return baseWeight;
    }
}
