package com.designpatterns.app.behavioral.iterator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CobraGunship implements IAircraft {
    @Override
    public void fly() {
        log.info("helicopter flying");
    }

    @Override
    public void land() {
        log.info("helicopter landing");
    }
}
