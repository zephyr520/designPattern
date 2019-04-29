package com.zephyr.observer.pattern.api;

import java.util.Observable;
import java.util.Observer;

import com.zephyr.observer.pattern.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement {
	
	private Observable observable;
	private float currentPressure = 29.2f;
	private float lastPressure;
	
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.lastPressure = this.currentPressure;
			this.currentPressure = weatherData.getPressure();
			this.display();
		}
	}

	public void display() {
		if (this.currentPressure < 27 && this.currentPressure > 18) {
			System.out.println("Forecast : Watch out for cooler, rainy weather");
		} else if (this.currentPressure >= 27) {
			System.out.println("Forcast: Improving weather on the way!" );
		} else {
			System.out.println("Forecast : More of the same");
		}
	}

	public float getLastPressure() {
		return lastPressure;
	}

}
