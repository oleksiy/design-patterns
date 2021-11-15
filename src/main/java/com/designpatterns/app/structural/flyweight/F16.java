package com.designpatterns.app.structural.flyweight;

public class F16 implements IAircraft{
    //intrinsic state
    private final String name = "F16";
    private final int personnel = 2;
    private final String dimensions = "15m long 3m wide";
    private final String wingspan = "33 feet";

    //Extrinsic state includes current position and current speed
    //to compute time to destination
    public double getTimeToDesitnation(int currX, int currY, int destX, int destY, int currSpeed) {
        //distance formula etc etc
        return 1;
    }
}
