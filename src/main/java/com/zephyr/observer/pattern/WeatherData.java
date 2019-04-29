package com.zephyr.observer.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @description 具体主题是实现
 * @author zephyr
 * @date 2019年4月26日
 */
public class WeatherData implements Subject {
	
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	/**
	 * 返回气象站监测到的温度
	 * @return
	 */
	public float getTemperature() {
		return temperature;
	}
	
	/**
	 * 返回气象站监测到的湿度
	 * @return
	 */
	public float getHumidity() {
		return humidity;
	}
	
	/**
	 * 返回气象站监测到的气压
	 * @return
	 */
	public float getPressure() {
		return pressure;
	}
	
	/**
	 * 一旦气象站测量到的温度，湿度，气压更新了，此方法就会被调用
	 */
	public void measurementsChanged() {
		// 检测到最新观测值，通知所有观察者
		this.notifyObservers();
	}
	
	public void setMeasuremenets(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		for (int i=0; i<observers.size(); i++) {
			observers.get(i).update(temperature, humidity, pressure);
		}
	}
}
