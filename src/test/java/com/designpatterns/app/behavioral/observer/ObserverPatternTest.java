package com.designpatterns.app.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ObserverPatternTest {

    @Test
    public void testObserverPatternBehavior() {
        ControlTower ct = new ControlTower();
        IAircraft f16 = new F16(ct);
        assertNotNull(ct.observers);
        assertNotNull(ct.listObservers());
    }
}
