package com.designpatterns.app.structural.adapter;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdapterPatternTest {
    @Test
    public void testAdapter() {
        HotAirBalloon hotAirBalloon = new HotAirBalloon();
        Adapter hotAirBalloonAdapter = new Adapter(hotAirBalloon);
        hotAirBalloonAdapter.fly();
    }
}
