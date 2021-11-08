package com.designpatterns.app.structural.adapter;

public class HotAirBalloon {
    String gasUsed = "Helium";

    void fly(String gasUsed) {
        //take off sequence based on the kind of fuel used
        //other code
        System.out.println("Hot air balloon filled with " + this.gasUsed + " is taking off.");
    }

    String inflatedWithGas() {
        return this.gasUsed;
    }
}
