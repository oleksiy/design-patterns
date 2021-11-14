package com.designpatterns.app.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Airforce implements IAlliancePart {
    List<IAlliancePart> planes = new ArrayList<>();

    public void add(IAlliancePart alliancePart) {
        planes.add(alliancePart);
    }

    @Override
    public int getPersonnel() {
        //go through the entire aiforce fleet and add up the # of people needed for each aircraft
        Iterator<IAlliancePart> iterator = planes.iterator();
        int staff = 0;

        while(iterator.hasNext()) {
            staff += iterator.next().getPersonnel();
        }

        return staff;
    }
}
