package com.zephyr.factory.pattern.pizza;

public class ChicagoStyleClamPizza extends Pizza {

	public ChicagoStyleClamPizza() {
		super.name = "Chicago Style Deep Dish Clam Pizza";
		super.dough = "Extra Thin Crust Dough";
		super.sauce = "Plum Tomato Sauce";
		
		super.toppings.add("Shredded Mozzarella Clam");
	}
	
	public void cut() {
		System.out.println("Cutting the  pizza into square slices");
	}
}
