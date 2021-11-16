package com.designpatterns.app.behavioral.chainofresponsibility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChainOfResponsibilityTest {
    @Test
    public void testChainOfResponsibility() {
        AbstractHandler lowFuelHandler = new LowFuelHandler(null); //the successor for low fuel handler is none
        FireHandler fireHandler = new FireHandler(lowFuelHandler); //the successor for fire handler is low fuel
        LowFuelRequest lowFuelRequest = new LowFuelRequest();
        fireHandler.handleRequest(lowFuelRequest);
        assertTrue(fireHandler.getNext().getClass().equals(LowFuelHandler.class));
    }
}
