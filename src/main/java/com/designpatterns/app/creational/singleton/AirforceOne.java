package com.designpatterns.app.creational.singleton;

public class AirforceOne {
    //Only Instance
    private static AirforceOne onlyInstance;

    //Make constructor private, only accessible to members of the class
    private AirforceOne() {

    }

    public void fly() {
        System.out.println("Airforce One is flying");
    }

    //create static method for object creation
    public static AirforceOne getInstance() {
        //Only one instance of the object when needed
        if(onlyInstance == null) {
            onlyInstance = new AirforceOne();
        }

        return onlyInstance;
    }
}


