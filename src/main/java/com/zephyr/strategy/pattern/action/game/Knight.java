package com.zephyr.strategy.pattern.action.game;

public class Knight extends Character {
	
	public Knight() {
		super.weaponBehavior = new BowAndArrowBehavior();
	}

	@Override
	public void fight() {
		System.out.print("骑士");
		super.weaponBehavior.useWeapon();
	}

}
