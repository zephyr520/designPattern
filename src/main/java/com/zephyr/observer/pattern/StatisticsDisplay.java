package com.zephyr.observer.pattern;

/**
 * @description 显示最小，平均和最大的观测值
 * @author zephyr
 * @date 2019年4月26日
 */
public class StatisticsDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + this.temperature + "/" + this.temperature + "/" + this.temperature);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.display();
	}

}
