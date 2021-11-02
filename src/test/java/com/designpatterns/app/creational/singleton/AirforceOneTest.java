package com.designpatterns.app.creational.singleton;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AirforceOneTest {
    @Test
    public void testSingletonClient() {
        AirforceOne a1 = AirforceOne.getInstance();
        a1.fly();
        AirforceOne a2 = AirforceOne.getInstance();
        assertNotNull(a1.equals(a2));
    }
}
