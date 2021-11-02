package com.designpatterns.app.creational.singleton;

public class AirforceOneWithDoubleCheckedLocking {

    private volatile static AirforceOneWithDoubleCheckedLocking onlyInstance;

    private AirforceOneWithDoubleCheckedLocking() {
    }

    public void fly() {
        System.out.println("Threadsafe Airforce One is flying.");
    }

    //static method for object creation
    //synchronize on the class object when calling new
    //double-checked locking is now considered an anti-pattern
    synchronized public static AirforceOneWithDoubleCheckedLocking getInstance() {
        if(onlyInstance == null) {
            synchronized (AirforceOneWithDoubleCheckedLocking.class) {
                if(onlyInstance == null) {
                    onlyInstance = new AirforceOneWithDoubleCheckedLocking();
                }
            }
        }
        return onlyInstance;
    }
}
