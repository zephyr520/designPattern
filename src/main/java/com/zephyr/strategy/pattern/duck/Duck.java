package com.zephyr.strategy.pattern.duck;

import com.zephyr.strategy.pattern.behavior.FlyBehavior;
import com.zephyr.strategy.pattern.behavior.QuackBehavior;

/**
 * @description 鸭子的超类
 * @author zephyr
 * @date 2019年4月25日
 */
public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("游泳");
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
