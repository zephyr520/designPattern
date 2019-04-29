package com.zephyr.strategy.pattern.behavior;

/**
 * @description 实现会飞的行为接口
 * @author zephyr
 * @date 2019年4月26日
 */
public class FlyWithWings implements FlyBehavior {

	public void fly() {
		System.out.println("我会飞");
	}

}
