package com.designpatterns.app.creational.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AbstractFactoryTest {
    @Test
    public void testF16AbstractFactory() {
        F16Factory f16Factory = new F16Factory();
        Boeing747Factory boeing747Factory = new Boeing747Factory();
        Aircraft a = new Aircraft(f16Factory);
        Aircraft b = new Aircraft(boeing747Factory);
        assertNotEquals(a, b);
    }
}
