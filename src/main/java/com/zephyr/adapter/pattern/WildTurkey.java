package com.zephyr.adapter.pattern;

/**
 * @description 火鸡的具体实现
 * @author zephyr
 * @date 2019年5月5日
 */
public class WildTurkey implements Turkey {

	public void gobble() {
		System.out.println("Gobble gobble");
	}

	public void fly() {
		System.out.println("I'm flying a short distance");
	}

}
