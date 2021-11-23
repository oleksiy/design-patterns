package com.designpatterns.app.behavioral.visitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Airforce {
    // Holds a collection of planes
    private Collection<IAircraft> planes = new ArrayList<>();

    // Returns an iterator to its collection of planes
    public Iterator<IAircraft> getIterator() {
        return planes.iterator();
    }

    public void setPlanes(Collection<IAircraft> planes) {
        this.planes = planes;
    }
}
