package com.designpatterns.app.behavioral.memento;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MementoPatternTest {
    @Test
    public void testMementoBehavior() throws IOException, ClassNotFoundException {
        BlackBox blackBox = new BlackBox(12350L, 88.2, 225.08f);
        byte[] memento = blackBox.getState();
        assertEquals(88.2, blackBox.getSpeed());
        blackBox.setSpeed(0);
        assertEquals(0, blackBox.getSpeed());
        //restore state
        blackBox = blackBox.setState(memento);
        assertEquals(88.2, blackBox.getSpeed());
    }
}
