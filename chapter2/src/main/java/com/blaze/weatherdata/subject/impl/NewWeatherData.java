package com.blaze.weatherdata.subject.impl;

import com.blaze.weatherdata.observer.inf.NewObserver;
import com.blaze.weatherdata.subject.inf.NewSubject;

import java.util.ArrayList;
import java.util.List;

public class NewWeatherData implements NewSubject {
    private final List<NewObserver> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public NewWeatherData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(NewObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(NewObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(NewObserver::update);
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChange();
    }

    public void measurementsChange() {
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
