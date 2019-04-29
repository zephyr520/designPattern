package com.zephyr.observer.pattern;

/**
 * @description 具体的观察者：显示当前观测值
 * @author zephyr
 * @date 2019年4月26日
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	public void display() {
		System.out.println("Current conditions：" + temperature + "F, degress and " + humidity + "% humidity");
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.display();
	}

}
