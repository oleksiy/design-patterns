package com.designpatterns.app.composition;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        log.debug("Squeak!");
    }
}
