package com.designpatterns.app.behavioral.visitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class F16 implements IAircraft {
    @Override
    public void accept(IAircraftVisitor visitor) {
        log.info("accept from F16 is called");
    }
}
