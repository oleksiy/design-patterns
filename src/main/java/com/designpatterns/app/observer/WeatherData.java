package com.designpatterns.app.observer;

import java.util.ArrayList;


public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = this.observers.indexOf(o);
        if (i >= 0) {
            this.observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < this.observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }

    public ArrayList<Observer> getObservers() {
        return this.observers;
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
