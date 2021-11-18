package com.designpatterns.app.behavioral.command;

public class LandingGearUpCommand implements Command {

    LandingGear landingGear;

    // This is called the receiver of the request and
    // actually has the logic to perform the action
    public LandingGearUpCommand(LandingGear l) {
        this.landingGear = l;
    }

    @Override
    public void execute() {
        landingGear.up();
    }
}
