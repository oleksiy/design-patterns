package com.designpatterns.app.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BridgePatternTest {

    @Test
    public void testObjectCreationUsingBridgePattern() {
        AbstractCorolla corolla = new Corolla_L(new Corolla_L_Impl_NorthAmerica());
        assertFalse(corolla.isCarRightHanded());

        AbstractCorolla corollaAsia = new Corolla_L(new Corolla_L_Impl_AsiaPacific());
        assertTrue(corollaAsia.isCarRightHanded());
    }
}
