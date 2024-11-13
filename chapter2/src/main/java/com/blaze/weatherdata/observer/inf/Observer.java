package com.blaze.weatherdata.observer.inf;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
