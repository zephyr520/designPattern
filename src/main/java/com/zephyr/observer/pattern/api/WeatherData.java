package com.zephyr.observer.pattern.api;

import java.util.Observable;

/***
 * @description 继承自java.util包中的可观察者类
 * @author zephyr
 * @date 2019年4月26日
 */
public class WeatherData extends Observable {

	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}
	
	public void measurementsChanged() {
		// 标记有数据更新
		super.setChanged();
		// 通知所有观察者
		super.notifyObservers();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
