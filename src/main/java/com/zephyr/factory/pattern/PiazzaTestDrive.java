package com.zephyr.factory.pattern;

import com.zephyr.factory.pattern.pizza.Pizza;
import com.zephyr.factory.pattern.store.ChicagoStylePizzaStore;
import com.zephyr.factory.pattern.store.NewYorkStylePizzaStore;
import com.zephyr.factory.pattern.store.PizzaStore;

/**
 * @description 生产披萨
 * @author zephyr
 * @date 2019年4月28日
 */
public class PiazzaTestDrive {

	public static void main(String[] args) {
		PizzaStore newYorkStore = new NewYorkStylePizzaStore();
		Pizza pizza = newYorkStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName());
		
		System.out.println();
		
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName());
	}
}
