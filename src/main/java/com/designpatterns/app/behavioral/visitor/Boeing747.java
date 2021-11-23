package com.designpatterns.app.behavioral.visitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Boeing747 implements IAircraft {
    @Override
    public void accept(IAircraftVisitor visitor) {
        log.info("Boeing accept called");
    }
}
