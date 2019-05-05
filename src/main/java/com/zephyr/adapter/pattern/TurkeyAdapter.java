package com.zephyr.adapter.pattern;

/**
 * @description 适配器实现鸭子的接口，让火鸡具有鸭子的行为
 * @author zephyr
 * @date 2019年5月5日
 */
public class TurkeyAdapter implements Duck {
	
	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	public void quack() {
		this.turkey.gobble();
	}

	public void fly() {
		for (int i=0; i<5; i++) {
			this.turkey.fly();
		}
	}

}
