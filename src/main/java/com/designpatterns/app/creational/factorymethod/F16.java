package com.designpatterns.app.creational.factorymethod;

public class F16 {
    IEngine engine;
    ICockpit cockpit;

    protected F16 makeF16() {
        engine = new F16Engine();
        cockpit = new F16Cockpit();
        return this;
    }

    public void taxi() {
        System.out.println("--F16 is taxing on the runway!--");
    }

    public void fly() {
        //superclass doesn't know what type of F16 is flying
        F16 f16 = makeF16();
        f16.taxi();
        System.out.println("F16 is airborne.");
    }
}
