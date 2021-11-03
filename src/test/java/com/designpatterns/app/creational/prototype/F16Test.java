package com.designpatterns.app.creational.prototype;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class F16Test {
    @Test
    public void testF16Implementation() {
        IAircraftPrototype prototype = new F16();
        //F16A
        IAircraftPrototype f16A = prototype.clone();
        f16A.setEngine(new F16Engine());

        //F16B
        IAircraftPrototype f16B = prototype.clone();
        f16B.setEngine(new F16Engine());

        assertNotEquals(f16A, f16B);
    }
}
