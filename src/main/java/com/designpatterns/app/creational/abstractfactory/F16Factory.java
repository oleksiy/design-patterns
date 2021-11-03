package com.designpatterns.app.creational.abstractfactory;

public class F16Factory {
    public IEngine createEngine() {
        return new F16Engine();
    }

    public IWings createWings() {
        return new F16Wings();
    }

    public ICockpit createCockpit() {
        return new F16Cockpit();
    }
}
