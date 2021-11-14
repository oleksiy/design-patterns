package com.designpatterns.app.structural.composite;

//This class acts as a part
public class F16 implements IAircraft, IAlliancePart {
    @Override
    public int getPersonnel() {
        //two pilots needed for an F16
        return 2;
    }
}
