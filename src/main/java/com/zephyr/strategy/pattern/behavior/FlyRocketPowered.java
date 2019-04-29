package com.zephyr.strategy.pattern.behavior;

/**
 * @description 实现拥有火箭动力一样飞行的接口 
 * @author zephyr
 * @date 2019年4月26日
 */
public class FlyRocketPowered implements FlyBehavior {

	public void fly() {
		System.out.println("我能飞的像火箭一样那么快");
	}

}
