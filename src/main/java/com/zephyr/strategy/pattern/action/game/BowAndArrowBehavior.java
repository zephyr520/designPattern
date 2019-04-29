package com.zephyr.strategy.pattern.action.game;

/**
 * @description 使用弓箭刺杀
 * @author zephyr
 * @date 2019年4月26日
 */
public class BowAndArrowBehavior implements WeaponBehavior {

	public void useWeapon() {
		System.out.println("使用弓箭射杀");
	}

}
