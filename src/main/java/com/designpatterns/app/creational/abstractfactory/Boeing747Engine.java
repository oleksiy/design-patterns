package com.designpatterns.app.creational.abstractfactory;

public class Boeing747Engine implements IEngine {
    @Override
    public void start() {
        System.out.println("747 Engine staring up.");
    }
}
