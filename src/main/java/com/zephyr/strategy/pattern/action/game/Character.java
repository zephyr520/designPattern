package com.zephyr.strategy.pattern.action.game;

/**
 * @description 人员抽象角色类，每种拥有不同的攻击值
 * @author zephyr
 * @date 2019年4月26日
 */
public abstract class Character {
	
	WeaponBehavior weaponBehavior;
	
	public abstract void fight();

	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
}
