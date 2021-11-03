package com.designpatterns.app.creational.factorymethod;

//Not the same as factory method pattern
public class F16SimpleFactory {
    public F16 makeF16(String variant) {
        switch(variant) {
            case "A":
                return new F16A();
            case "B":
                return new F16B();
            default:
                return new F16();
        }
    }
}
