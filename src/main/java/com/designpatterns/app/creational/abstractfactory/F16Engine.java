package com.designpatterns.app.creational.abstractfactory;

public class F16Engine implements IEngine{
    @Override
    public void start() {
        System.out.println("F16 Engine has been started.");
    }
}
