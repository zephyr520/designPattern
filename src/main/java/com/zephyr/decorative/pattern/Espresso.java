package com.zephyr.decorative.pattern;

/**
 * @description 浓咖啡饮料
 * @author zephyr
 * @date 2019年4月28日
 */
public class Espresso extends Beverage {
	
	public Espresso() {
		// 浓缩咖啡
		super.description = "Espresso Coffee";
	}

	@Override
	public double cost() {
		// 浓缩咖啡的价格
		return 1.99;
	}

}
