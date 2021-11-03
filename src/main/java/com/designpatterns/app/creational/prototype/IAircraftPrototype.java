package com.designpatterns.app.creational.prototype;

public interface IAircraftPrototype {
    void fly();
    IAircraftPrototype clone();
    void setEngine(F16Engine f16Engine);
}
