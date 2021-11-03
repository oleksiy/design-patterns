package com.designpatterns.app.creational.prototype;

public class F16 implements IAircraftPrototype{
    //default engine
    F16Engine f16Engine = new F16Engine();

    @Override
    public void fly() {
        System.out.println("An F16 is flying.");
    }

    @Override
    public IAircraftPrototype clone() {
        return new F16();
    }

    @Override
    public void setEngine(F16Engine f16Engine) {
        this.f16Engine = f16Engine;
    }
}
