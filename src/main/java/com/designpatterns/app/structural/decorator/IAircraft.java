package com.designpatterns.app.structural.decorator;

public interface IAircraft {
    float baseWeight = 100;
    void fly();
    void land();
    float getWeight();
}
