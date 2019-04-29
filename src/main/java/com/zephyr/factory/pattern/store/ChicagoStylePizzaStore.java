package com.zephyr.factory.pattern.store;

import com.zephyr.factory.pattern.pizza.ChicagoStyleCheesePizza;
import com.zephyr.factory.pattern.pizza.ChicagoStyleClamPizza;
import com.zephyr.factory.pattern.pizza.ChicagoStylePepperoniPizza;
import com.zephyr.factory.pattern.pizza.ChicagoStyleVeggiePizza;
import com.zephyr.factory.pattern.pizza.Pizza;

/**
 * @description 芝加哥风格的披萨店
 * @author zephyr
 * @date 2019年4月28日
 */
public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("cheese".equals(type)) {
			// 创建芝加哥风格的芝士披萨
			pizza = new ChicagoStyleCheesePizza();
		} else if("pepperoni".equals(type)) {
			// 创建芝加哥风格的意大利辣味香肠披萨
			pizza = new ChicagoStylePepperoniPizza();
		} else if("clam".equals(type)) {
			// 创建芝加哥风格的蛤披萨
			pizza = new ChicagoStyleClamPizza();
		} else if("veggie".equals(type)) {
			// 创建芝加哥风格的素食披萨
			pizza = new ChicagoStyleVeggiePizza();
		}
		return pizza;
	}

}
