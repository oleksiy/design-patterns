package com.designpatterns.app.behavioral.iterator;

import java.util.List;

public class JetsIterator implements Iterator {

    public JetsIterator(List<IAircraft> jets) {
    }

    @Override
    public Object next() {

        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
