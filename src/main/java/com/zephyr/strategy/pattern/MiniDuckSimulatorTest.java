package com.zephyr.strategy.pattern;

import com.zephyr.strategy.pattern.behavior.FlyRocketPowered;
import com.zephyr.strategy.pattern.duck.Duck;
import com.zephyr.strategy.pattern.duck.MallardDuck;
import com.zephyr.strategy.pattern.duck.ModelDuck;

public class MiniDuckSimulatorTest {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		System.out.println("======================");
		
		Duck model = new ModelDuck();
		model.performFly();
		//改变飞行的行为
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
