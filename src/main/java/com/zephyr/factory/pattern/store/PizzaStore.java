package com.zephyr.factory.pattern.store;

import com.zephyr.factory.pattern.pizza.Pizza;

/**
 * @description 披萨店工厂
 * @author zephyr
 * @date 2019年4月28日
 */
public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = this.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	public abstract Pizza createPizza(String type); 
}
