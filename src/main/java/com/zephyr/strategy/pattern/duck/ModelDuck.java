package com.zephyr.strategy.pattern.duck;

import com.zephyr.strategy.pattern.behavior.FlyNoWay;
import com.zephyr.strategy.pattern.behavior.Quack;

/**
 * @description 模型鸭
 * @author zephyr
 * @date 2019年4月25日
 */
public class ModelDuck extends Duck {
	
	public ModelDuck() {
		super.flyBehavior = new FlyNoWay();
		super.quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("我是模型鸭");
	}

}
