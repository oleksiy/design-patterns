package com.designpatterns.app.structural.facade;

public class BoeingFuelMonitor {
    private int remainingFeulInGallons = 0;
    public int getRemainingFeulInGallons() {
        return remainingFeulInGallons;
    }

    public void setRemainingFeulInGallons(int remainingFeulInGallons) {
        this.remainingFeulInGallons = remainingFeulInGallons;
    }

    public void turnOff() {
    }
}
