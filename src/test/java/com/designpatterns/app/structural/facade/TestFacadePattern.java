package com.designpatterns.app.structural.facade;

import org.junit.jupiter.api.Test;

public class TestFacadePattern {
    @Test
    public void testFacadePattern() {
        BoeingAltitudeMonitor altitudeMonitor = new BoeingAltitudeMonitor();
        BoeingEngineController engineController = new BoeingEngineController();
        BoeingFuelMonitor fuelMonitor = new BoeingFuelMonitor();
        BoeingNavigationSystem navigationSystem = new BoeingNavigationSystem();
        //Instantiate the facade
        AutopilotFacade autopilotFacade = new AutopilotFacade(altitudeMonitor, engineController, fuelMonitor, navigationSystem);
        //Interface with an entire sub-system
        autopilotFacade.autopilotOn();
        autopilotFacade.autopilotOff();
    }
}
