package com.designpatterns.app.creational.factorymethod;

public class F16B extends F16{
    @Override
    protected F16 makeF16() {
        super.makeF16();
        engine = new F16BEngine();
        return this;
    }
}
