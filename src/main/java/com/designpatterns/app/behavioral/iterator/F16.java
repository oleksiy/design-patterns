package com.designpatterns.app.behavioral.iterator;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class F16 implements IAircraft {
    @Override
    public void fly() {
        log.info("F16 is flying");
    }

    @Override
    public void land() {
        log.info("F16  is landing");
    }

}
