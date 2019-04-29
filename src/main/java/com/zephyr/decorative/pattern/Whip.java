package com.zephyr.decorative.pattern;

/**
 * @description 奶油调料
 * @author zephyr
 * @date 2019年4月28日
 */
public class Whip extends CondimentDecorator {
	
	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		// 奶油 + 饮料价格
		return 0.38 + beverage.cost();
	}

}
