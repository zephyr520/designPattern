package com.zephyr.factory.pattern.pizza;

public class NewYorkStyleVeggiePizza extends Pizza {

	public NewYorkStyleVeggiePizza() {
		super.name = "New York Style Sauce and Veggie  Pizza";
		super.dough = "Extra Thin Crust Dough";
		super.sauce = "Plum Tomato Sauce";
		
		super.toppings.add("Shredded Mozzarella Veggie");
	}
}
