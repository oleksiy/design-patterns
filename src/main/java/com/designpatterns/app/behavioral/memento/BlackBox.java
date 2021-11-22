package com.designpatterns.app.behavioral.memento;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class BlackBox implements Serializable {
    private long altitude;
    private double speed;
    private float engineTemperature;
    private static final long serialVersionUID = 1L;

    public BlackBox(long altitude, double speed, float engineTemperature) {
        this.altitude = altitude;
        this.speed = speed;
        this.engineTemperature = engineTemperature;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double newSpeed) {
        this.speed = newSpeed;
    }

    //saving state as a byte stream
    public byte[] getState() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutput out = null;
        byte[] memento = null;
        try {
            out = new ObjectOutputStream(bos);
            out.writeObject(this);
            out.flush();
            memento = bos.toByteArray();
        } finally {
            try {
                bos.close();
            } catch (IOException ex) {
                log.error("Something's wrong with streaming this object {}", ex.getCause());
            }
        }
        return memento;
    }

    //restoring state
    public BlackBox setState(byte[] memento) throws IOException, ClassNotFoundException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(memento);
        ObjectInputStream ois = new ObjectInputStream(inputStream);
        BlackBox blackBox = (BlackBox) ois.readObject();
        ois.close();
        return blackBox;
    }
}
