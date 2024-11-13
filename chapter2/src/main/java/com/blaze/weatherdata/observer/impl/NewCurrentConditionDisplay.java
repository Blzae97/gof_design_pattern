package com.blaze.weatherdata.observer.impl;

import com.blaze.weatherdata.display.DisplayElement;
import com.blaze.weatherdata.observer.inf.NewObserver;
import com.blaze.weatherdata.subject.impl.NewWeatherData;

public class NewCurrentConditionDisplay implements NewObserver, DisplayElement {
    private float temperature;
    private float humidity;
    private final NewWeatherData weatherData;

    public NewCurrentConditionDisplay(NewWeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 상태: 온도 " + temperature + "F, 습도 " + humidity + "%");
    }
}
