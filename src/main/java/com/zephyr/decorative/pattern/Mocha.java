package com.zephyr.decorative.pattern;

/**
 * @description 摩卡调料作为装饰类继承自调料装饰类
 * @author zephyr
 * @date 2019年4月28日
 */
public class Mocha extends CondimentDecorator {
	
	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// 描述：饮料添加摩卡
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		// 摩卡调料的价格 + 具体饮料的价格
		return 0.2 + beverage.cost();
	}

}
