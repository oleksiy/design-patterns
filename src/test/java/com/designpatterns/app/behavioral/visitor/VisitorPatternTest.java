package com.designpatterns.app.behavioral.visitor;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class VisitorPatternTest {
    @Test
    public void testVisitorPatternStructure() {
        Airforce af = new Airforce();
        Collection<IAircraft> p = new ArrayList<>();
        p.add(new Boeing747());
        p.add(new F16());
        p.add(new Boeing747());
        af.setPlanes(p);
        Iterator<IAircraft> planes = af.getIterator();
        MetricsVisitor mv = new MetricsVisitor();
        while(planes.hasNext()) {
            planes.next().accept(mv);
        }
    }
}
