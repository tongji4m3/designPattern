package ObserverPattern;

import ObserverPattern.observer.CurrentConditionsDisplay;
import ObserverPattern.observer.ForecastDisplay;
import ObserverPattern.observer.StatisticsDisplay;
import ObserverPattern.subject.WeatherData;

public class MainTest
{
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        /*
        输出:
        CurrentConditionsDisplay:80.0,65.0
        ForecastDisplay:80.0,65.0,30.4
        StatisticsDisplay:80.0,65.0,30.4
         */
    }
}
