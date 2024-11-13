package com.blaze.weatherdata.subject.inf;

import com.blaze.weatherdata.observer.inf.NewObserver;

public interface NewSubject {
    void registerObserver(NewObserver observer);

    void removeObserver(NewObserver observer);

    void notifyObservers();
}
