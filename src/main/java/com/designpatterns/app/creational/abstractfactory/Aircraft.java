package com.designpatterns.app.creational.abstractfactory;

public class Aircraft {
    IEngine engine;
    ICockpit cockpit;
    IWings wings;
    IAircraftFactory factory;

    public Aircraft(IAircraftFactory factory) {
        this.factory = factory;
    }


    protected Aircraft makeAircraft() {
        engine = factory.createEngine();
        cockpit = factory.createCockpit();
        wings = factory.createWings();
        return this;
    }

    private void taxt() {
        System.out.println("Taxing on runway");
    }

    public void fly() {
        Aircraft aircraft = makeAircraft();
        aircraft.taxt();
        System.out.println("Flying.");
    }
}
