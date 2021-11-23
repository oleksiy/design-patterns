package com.designpatterns.app.structural.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class F16PreFlightCheckList extends AbstractPreFlightCheckList {
    @Override
    void checkAirPressure() {
        log.info("F16 specific air pressure check");
    }

    @Override
    protected boolean doorsLocked() {
        //F16 has no doors, so just return true
        return true;
    }
}
