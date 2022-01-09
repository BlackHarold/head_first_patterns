package home.bluewhale.observer;

import home.bluewhale.observer.display.CurrentConditionsDisplay;
import home.bluewhale.observer.display.ForecastDisplay;
import home.bluewhale.observer.display.HeatIndexDisplay;
import home.bluewhale.observer.display.StatisticsDisplay;
import home.bluewhale.observer.subject.WeatherData;

public class Observer {
    public static void main(String[] args) {

        //#2 Observer
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
