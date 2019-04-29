package com.zephyr.factory.pattern.pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

	public ChicagoStylePepperoniPizza() {
		super.name = "Chicago Style Deep Dish Pepperoni Pizza";
		super.dough = "Extra Thin Crust Dough";
		super.sauce = "Plum Tomato Sauce";
		
		super.toppings.add("Shredded Mozzarella Pepperoni");
	}
	
	public void cut() {
		System.out.println("Cutting the  pizza into square slices");
	}
}
