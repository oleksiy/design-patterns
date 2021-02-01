package com.designpatterns.app.composition;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    public void display() {
        log.debug("This is a model duck.");
    }
}
