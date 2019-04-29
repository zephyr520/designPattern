package com.zephyr.strategy.pattern.behavior;

/**
 * @description 实现不会飞的行为接口
 * @author zephyr
 * @date 2019年4月26日
 */
public class FlyNoWay implements FlyBehavior {

	public void fly() {
		System.out.println("我不会飞");
	}

}
