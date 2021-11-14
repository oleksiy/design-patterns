package com.designpatterns.app.structural.composite;

//This class acts as a part
public class C130Hercules implements IAircraft, IAlliancePart{
    @Override
    public int getPersonnel() {
        //Big plane 5 people
        return 5;
    }
}
