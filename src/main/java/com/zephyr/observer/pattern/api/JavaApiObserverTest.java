package com.zephyr.observer.pattern.api;


public class JavaApiObserverTest {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		weatherData.setMeasurements(80, 60, 34.2f);
		weatherData.deleteObserver(forecastDisplay);
		weatherData.setMeasurements(80, 75, 29.2f);
		weatherData.deleteObserver(generalDisplay);
		weatherData.setMeasurements(75, 55, 25.2f);

	}
}
