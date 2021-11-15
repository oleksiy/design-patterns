package com.designpatterns.app.structural.proxy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ProxyPatternTest {
    @Test
    public void testProxyPatternStructure() {
        DroneProxy proxy = new DroneProxy();
        proxy.turnLeft();
        proxy.turnRight();

    }
}
