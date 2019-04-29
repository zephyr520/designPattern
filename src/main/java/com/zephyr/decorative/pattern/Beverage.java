package com.zephyr.decorative.pattern;

/***
 * @description 饮料抽象父类
 * @author zephyr
 * @date 2019年4月28日
 */
public abstract class Beverage {

	String description = "Unkown Beverage";
	
	public String getDescription() {
		return description;
	}
	/**
	 * 饮料的价格
	 * @return
	 */
	public abstract double cost();
}
