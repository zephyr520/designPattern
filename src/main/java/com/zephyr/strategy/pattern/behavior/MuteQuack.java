package com.zephyr.strategy.pattern.behavior;

/**
 * @description 实现鸭子不会叫的行为
 * @author zephyr
 * @date 2019年4月26日
 */
public class MuteQuack implements QuackBehavior {

	public void quack() {
		System.out.println("叫不出声");
	}

}
