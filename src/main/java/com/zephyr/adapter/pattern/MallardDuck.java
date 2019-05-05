package com.zephyr.adapter.pattern;

/**
 * @description 绿头鸭
 * @author zephyr
 * @date 2019年5月5日
 */
public class MallardDuck implements Duck {

	public void quack() {
		System.out.println("Quack");
	}

	public void fly() {
		System.out.println("I'm flying");
	}

}
