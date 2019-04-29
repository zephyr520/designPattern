package com.zephyr.strategy.pattern.action.game;

public class King extends Character {
	
	public King() {
		super.weaponBehavior = new SwordBehavior();
	}

	@Override
	public void fight() {
		System.out.print("国王");
		super.weaponBehavior.useWeapon();
	}

}
