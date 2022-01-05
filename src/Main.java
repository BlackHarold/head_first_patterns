import home.bluewhale.observer.display.CurrentConditionsDisplay;
import home.bluewhale.observer.display.ForecastDisplay;
import home.bluewhale.observer.display.HeatIndexDisplay;
import home.bluewhale.observer.display.StatisticsDisplay;
import home.bluewhale.observer.subject.WeatherData;
import home.bluewhale.strategy.client.Duck;
import home.bluewhale.strategy.client.RubberDuck;
import home.bluewhale.strategy.interfaces.fly.FlyWithWings;
import home.bluewhale.strategy.interfaces.quack.Quack;

public class Main {

    public static void main(String[] args) {

        //#1 Strategy
        Duck duck = new RubberDuck();
        duck.setFb(new FlyWithWings());
        duck.setQb(new Quack());

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
