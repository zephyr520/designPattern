package com.zephyr.factory.pattern.pizza;

/**
 * @description 创建芝加哥风格的披萨
 * @author zephyr
 * @date 2019年4月28日
 */
public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		super.name = "Chicago Style Deep Dish Cheese Pizza";
		super.dough = "Extra Thin Crust Dough";
		super.sauce = "Plum Tomato Sauce";
		
		super.toppings.add("Shredded Mozzarella Cheese");
	}
	
	public void cut() {
		System.out.println("Cutting the  pizza into square slices");
	}
}
