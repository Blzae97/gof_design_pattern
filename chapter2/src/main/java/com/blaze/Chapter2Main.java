package com.blaze;

import com.blaze.weatherdata.observer.impl.CurrentConditionDisplay;
import com.blaze.weatherdata.observer.impl.NewCurrentConditionDisplay;
import com.blaze.weatherdata.subject.impl.NewWeatherData;
import com.blaze.weatherdata.subject.impl.WeatherData;

public class Chapter2Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65 ,30.4f);
        weatherData.setMeasurements(50, 45 ,30.4f);
        weatherData.setMeasurements(60, 35 ,30.4f);

        NewWeatherData newWeatherData = new NewWeatherData();
        NewCurrentConditionDisplay newCurrentConditionDisplay = new NewCurrentConditionDisplay(newWeatherData);

        newWeatherData.setMeasurements(10, 65 ,30.4f);
    }
}