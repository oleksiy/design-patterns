package com.designpatterns.app.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class F16 implements IObserver, IAircraft {

    ISubject observable;

    public F16(ISubject observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void fly() {
        log.info("F16 is flying ...");

    }

    @Override
    public void land() {
        log.info("Unsubscribing from control tower.");
        // Don't forget to unsubscribe from control tower updates
        observable.removeObserver(this);
    }

    @Override
    public void update(Object newState) {
        log.info("state updated");
        // Take appropriate action based on newState
    }
}
