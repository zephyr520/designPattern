package com.zephyr.observer.pattern;

public class WeatherStationTest {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		// 1号布告板向气象站注册成为观察者
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		// 2号布告板向气象站注册成为观察者
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		// 3号布告板向气象站注册成为观察者
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.removeObserver(currentConditionDisplay);
		weatherData.setMeasuremenets(80, 65, 30.4f);
		// 将观察statisticsDisplay 去掉
		weatherData.removeObserver(statisticsDisplay);
		weatherData.registerObserver(currentConditionDisplay);
		weatherData.setMeasuremenets(82, 70, 29.2f);
		
		// 将观察者forecastDisplay去除
		weatherData.removeObserver(forecastDisplay);
		weatherData.registerObserver(statisticsDisplay);
		weatherData.setMeasuremenets(78, 90, 29.2f);
	}

}
