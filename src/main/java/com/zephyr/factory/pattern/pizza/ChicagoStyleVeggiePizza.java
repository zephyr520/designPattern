package com.zephyr.factory.pattern.pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

	public ChicagoStyleVeggiePizza() {
		super.name = "Chicago Style Deep Dish Veggie Pizza";
		super.dough = "Extra Thin Crust Dough";
		super.sauce = "Plum Tomato Sauce";
		
		super.toppings.add("Shredded Mozzarella Veggie");
	}
	
	public void cut() {
		System.out.println("Cutting the  pizza into square slices");
	}
}
