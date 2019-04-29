package com.zephyr.factory.pattern.pizza;

public class NewYorkStylePepperoniPizza extends Pizza {

	public NewYorkStylePepperoniPizza() {
		super.name = "New York Style Sauce and Pepperoni Pizza";
		super.dough = "Thin Crust Dough";
		super.sauce = "Marinara Sauce";
		
		super.toppings.add("Grated Reggiano Pepperoni");
	}
}
