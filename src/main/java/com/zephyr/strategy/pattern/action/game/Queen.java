package com.zephyr.strategy.pattern.action.game;

public class Queen extends Character {
	
	public Queen() {
		super.weaponBehavior = new KnifeBehavior();
	}
	
	@Override
	public void fight() {
		System.out.print("王后");
		super.weaponBehavior.useWeapon();
	}

}
