package com.zephyr.observer.pattern.api;

import java.util.Observable;
import java.util.Observer;

import com.zephyr.observer.pattern.DisplayElement;

/**
 * @description 实现java.util包中观察者接口
 * @author zephyr
 * @date 2019年4月26日
 */
public class GeneralDisplay implements Observer, DisplayElement {
	
	private Observable observable;
	private float temperature;
	private float humidity;
	
	public GeneralDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.display();
		}
	}

	public void display() {
		System.out.println("Current conditions：" + temperature + "F, degress and " + humidity + "% humidity");
	}

}
