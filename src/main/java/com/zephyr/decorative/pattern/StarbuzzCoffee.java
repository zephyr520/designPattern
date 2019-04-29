package com.zephyr.decorative.pattern;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		// 购买浓缩咖啡
		Beverage espresso = new Espresso();
		System.out.println("饮料是：" + espresso.getDescription() + ",价格是：$" + espresso.cost());
		
		// 购买的是黑烤咖啡
		Beverage darkRoast = new DarkRoast();
		// 加 摩卡调料 * 2
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		// 加 奶油调料
		darkRoast = new Whip(darkRoast);
		System.out.println("饮料是：" + darkRoast.getDescription() + ", 价格是：$" + darkRoast.cost());
	}

}
