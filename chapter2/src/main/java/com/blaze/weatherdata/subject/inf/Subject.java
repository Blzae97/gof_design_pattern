package com.blaze.weatherdata.subject.inf;

import com.blaze.weatherdata.observer.inf.Observer;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
