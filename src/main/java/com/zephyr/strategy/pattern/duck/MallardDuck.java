package com.zephyr.strategy.pattern.duck;

import com.zephyr.strategy.pattern.behavior.FlyWithWings;
import com.zephyr.strategy.pattern.behavior.Quack;

/**
 * @description 绿头鸭
 * @author zephyr
 * @date 2019年4月25日
 */
public class MallardDuck extends Duck {
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("我是绿头鸭");
	}

}
