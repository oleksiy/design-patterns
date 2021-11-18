package com.designpatterns.app.behavioral.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LandingGearDownCommand implements Command {

    LandingGear landingGear;

    // This is called the receiver of the request and
    // actually has the logic to perform the action
    public LandingGearDownCommand(LandingGear l) {
        this.landingGear = l;
    }

    @Override
    public void execute() {
        landingGear.down();
    }
}
