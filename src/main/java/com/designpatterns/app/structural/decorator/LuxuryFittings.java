package com.designpatterns.app.structural.decorator;

import lombok.extern.slf4j.Slf4j;

//concrete decorator
@Slf4j
public class LuxuryFittings extends BoeingDecorator {
    IAircraft boeing;

    public LuxuryFittings(IAircraft boeing) {
        this.boeing = boeing;
    }

    @Override
    public void fly() {
        boeing.fly();
    }

    @Override
    public void land() {
        boeing.land();
    }

    @Override
    public float getWeight() {
        return 30.5f + boeing.getWeight();
    }
}
