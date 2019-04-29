package com.zephyr.strategy.pattern.action.game;

public class ActionGameTest {

	public static void main(String[] args) {
		Character king = new King();
		king.fight();
		Character queen = new Queen();
		queen.fight();
	}

}
