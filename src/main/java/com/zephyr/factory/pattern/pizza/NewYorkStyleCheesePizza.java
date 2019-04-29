package com.zephyr.factory.pattern.pizza;

/**
 * @description 纽约风格的芝士披萨
 * @author zephyr
 * @date 2019年4月28日
 */
public class NewYorkStyleCheesePizza extends Pizza {

	public NewYorkStyleCheesePizza() {
		super.name = "New York Style Sauce and Cheese Pizza";
		super.dough = "Thin Crust Dough";
		super.sauce = "Marinara Sauce";
		
		super.toppings.add("Grated Reggiano Cheese");
	}
}
