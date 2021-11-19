package com.designpatterns.app.behavioral.command;

import org.junit.jupiter.api.Test;

public class CommandPatternTest {
    @Test
    public void commandPatternStructureTest() {
        LandingGear landingGear = new LandingGear();
        LandingGearDownCommand landingGearDownCommand = new LandingGearDownCommand(landingGear);
        LandingGearUpCommand landingGearUpCommand = new LandingGearUpCommand(landingGear);

        InstrumentPanel instrumentPanel = new InstrumentPanel();
        //Assign commands
        instrumentPanel.setCommand(0, landingGearUpCommand);
        instrumentPanel.setCommand(1, landingGearDownCommand);

        instrumentPanel.lowerLandingGear();
        instrumentPanel.retractLandingGear();

    }
}
