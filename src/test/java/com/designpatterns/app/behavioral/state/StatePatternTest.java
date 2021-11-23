package com.designpatterns.app.behavioral.state;

import org.junit.jupiter.api.Test;

public class StatePatternTest {
    @Test
    public void testStatePatternStructure() {
        F16 f16 = new F16();
        f16.startsEngine();
        f16.fliesPlane();
        f16.ejectsPlane();
    }
}
