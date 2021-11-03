package com.designpatterns.app.creational.abstractfactory;

public interface IAircraftFactory {
    IEngine createEngine();
    IWings createWings();
    ICockpit createCockpit();
}
