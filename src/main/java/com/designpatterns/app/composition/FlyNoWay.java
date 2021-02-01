package com.designpatterns.app.composition;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        log.debug("Can't fly.");
    }
}
