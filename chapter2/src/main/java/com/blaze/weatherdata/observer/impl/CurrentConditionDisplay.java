package com.blaze.weatherdata.observer.impl;

import com.blaze.weatherdata.display.DisplayElement;
import com.blaze.weatherdata.observer.inf.Observer;
import com.blaze.weatherdata.subject.impl.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private final WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 상태: 온도 " + temperature + "F, 습도 " + humidity + "%");
    }
}
