package com.zephyr.decorative.pattern;

/***
 * @description HouseBlend Coffee
 * @author zephyr
 * @date 2019年4月28日
 */
public class HouseBlendCoffee extends Beverage {
	
	public HouseBlendCoffee() {
		super.description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
