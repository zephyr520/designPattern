package com.zephyr.adapter.pattern;

public class AdapterTest {

	public static void main(String[] args) {
		// 创建一只绿头鸭
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		// 将火鸡包装进一个火鸡适配器中，让其看起来像一只鸭子
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		System.out.println("The turkey says: ");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\n The duck says: ");
		testDuck(duck);
		
		System.out.println("\n The Turkey Adapter says: ");
		testDuck(turkeyAdapter);
	}
	
	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
