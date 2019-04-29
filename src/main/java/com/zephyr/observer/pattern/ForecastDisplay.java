package com.zephyr.observer.pattern;

/**
 * @description 显示天气预报
 * @author zephyr
 * @date 2019年4月26日
 */
public class ForecastDisplay implements Observer, DisplayElement {
	
	private float pressure;
	private Subject weatherData;
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void display() {
		if (this.pressure < 25 && this.pressure > 18) {
			System.out.println("Forecast : Watch out for cooler, rainy weather");
		} else if (this.pressure > 30) {
			System.out.println("Forcast: Improving weather on the way!" );
		} else {
			System.out.println("Forecast : More of the same");
		}
	}

	public void update(float temperature, float humidity, float pressure) {
		this.pressure = pressure;
		this.display();
	}

}
