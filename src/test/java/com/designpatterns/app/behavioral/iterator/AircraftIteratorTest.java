package com.designpatterns.app.behavioral.iterator;

import org.junit.jupiter.api.Test;

public class AircraftIteratorTest {
    @Test
    public void testIteratorPattern() {
        AirForce airForce = new AirForce();

        Iterator jets = airForce.createJetsIterator();

        while (jets.hasNext()) {
            jets.next();
        }

        Iterator allPlanes = airForce.createIterator();

        while (allPlanes.hasNext()) {
            allPlanes.next();
        }
    }
}
