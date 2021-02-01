package com.designpatterns.app.composition;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        log.debug("Flying with wings!");
    }
}
