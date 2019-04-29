package com.zephyr.strategy.pattern.behavior;

/**
 * @description 实现吱吱叫的行为 
 * @author zephyr
 * @date 2019年4月26日
 */
public class Squeak implements QuackBehavior {

	public void quack() {
		System.out.println("橡皮鸭子吱吱叫");
	}

}
