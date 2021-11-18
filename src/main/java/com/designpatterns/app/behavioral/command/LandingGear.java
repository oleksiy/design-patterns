package com.designpatterns.app.behavioral.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LandingGear {
    public void down() {
        log.info("Lowering landing gear.");
    }
    public void up() {
        log.info("Retracting landing gear.");
    }
}
