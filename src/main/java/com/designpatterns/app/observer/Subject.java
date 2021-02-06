package com.designpatterns.app.observer;

import com.designpatterns.app.observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
