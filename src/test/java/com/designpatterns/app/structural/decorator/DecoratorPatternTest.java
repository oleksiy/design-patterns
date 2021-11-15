package com.designpatterns.app.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorPatternTest {
    @Test
    public void decoratorPatternTest() {
        IAircraft baseModel = new Boeing747();
        IAircraft luxuryModel = new LuxuryFittings(baseModel);
        IAircraft bulletproofModel = new BulletProof(luxuryModel);
        bulletproofModel.fly();
        assertEquals(180.5f, bulletproofModel.getWeight());
    }
}
