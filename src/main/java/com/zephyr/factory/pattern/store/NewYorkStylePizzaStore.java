package com.zephyr.factory.pattern.store;

import com.zephyr.factory.pattern.pizza.NewYorkStyleCheesePizza;
import com.zephyr.factory.pattern.pizza.NewYorkStyleClamPizza;
import com.zephyr.factory.pattern.pizza.NewYorkStylePepperoniPizza;
import com.zephyr.factory.pattern.pizza.NewYorkStyleVeggiePizza;
import com.zephyr.factory.pattern.pizza.Pizza;

/**
 * @description 纽约风格的披萨店
 * @author zephyr
 * @date 2019年4月28日
 */
public class NewYorkStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("cheese".equals(type)) {
			// 创建纽约风格的芝士披萨
			pizza = new NewYorkStyleCheesePizza();
		} else if("pepperoni".equals(type)) {
			// 创建纽约风格的意大利辣味香肠披萨
			pizza = new NewYorkStylePepperoniPizza();
		} else if("clam".equals(type)) {
			// 创建纽约风格的蛤蛎披萨
			pizza = new NewYorkStyleClamPizza();
		} else if("veggie".equals(type)) {
			// 创建纽约风格的素食披萨
			pizza = new NewYorkStyleVeggiePizza();
		}
		return pizza;
	}

}
