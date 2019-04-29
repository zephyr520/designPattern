package com.zephyr.decorative.pattern;

/**
 * @description Dark Roast Coffee 
 * @author zephyr
 * @date 2019年4月28日
 */
public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		super.description = "Dark Roast Coffee";
	}

	@Override
	public double cost() {
		return 1.25;
	}

}
