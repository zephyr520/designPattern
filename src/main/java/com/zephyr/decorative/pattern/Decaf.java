package com.zephyr.decorative.pattern;

/**
 * @description Decaf Coffee
 * @author zephyr
 * @date 2019年4月28日
 */
public class Decaf extends Beverage {
	
	public Decaf() {
		super.description = "Decaf Coffee";
	}

	@Override
	public double cost() {
		return 0.78;
	}

}
