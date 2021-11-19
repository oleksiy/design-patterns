package com.designpatterns.app.behavioral.mediator;

import org.junit.jupiter.api.Test;

public class MediatorPatternTest {
    @Test
    public void testMediatorPattern() {
        ControlTower ct = new ControlTower();
        F16 f16 = new F16(ct);
        f16.requestControlTowerToLand();
    }
}
