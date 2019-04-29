package com.zephyr.strategy.pattern.action.game;

public class Troll extends Character {
	
	public Troll() {
		super.weaponBehavior = new AxeBehavior();
	}
	
	@Override
	public void fight() {
		System.out.print("巨魔");
		super.weaponBehavior.useWeapon();
	}

}
