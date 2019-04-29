package com.zephyr.strategy.pattern.behavior;

/**
 * @description 实现呱呱叫的行为
 * @author zephyr
 * @date 2019年4月26日
 */
public class Quack implements QuackBehavior {

	public void quack() {
		System.out.println("鸭子呱呱叫");
	}

}
