package com.designpatterns.app.structural.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositePatternTest {
    @Test
    public void testCompositePattern() {
        Airforce natoAlliance = new Airforce();
        F16 frenchF16 = new F16();
        C130Hercules germanCargoPlane = new C130Hercules();

        natoAlliance.add(frenchF16);
        natoAlliance.add(germanCargoPlane);

        assertEquals(7, natoAlliance.getPersonnel());
    }
}
