package com.zephyr.factory.pattern.pizza;

public class NewYorkStyleClamPizza extends Pizza {

	public NewYorkStyleClamPizza() {
		super.name = "New York Style Sauce and Clam Pizza";
		super.dough = "Thin Crust Dough";
		super.sauce = "Marinara Sauce";
		
		super.toppings.add("Grated Reggiano Clam");
	}
}
