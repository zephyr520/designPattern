package com.zephyr.factory.pattern.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * @description 披萨的默认做法
 * @author zephyr
 * @date 2019年4月28日
 */
public abstract class Pizza {
	
	String name;
	// 面团
	String dough;
	//酱料
	String sauce;
	List<String> toppings = new ArrayList<String>();
	/**
	 * 准备
	 */
	public void prepare() {
		System.out.println("Preparing : " + name);
		// 揉面团
		System.out.println("Tossing dough...");
		// 加酱料
		System.out.println("Adding sauce");
		System.out.println("Adding toppings");
		for (int i=0; i<toppings.size(); i++) {
			System.out.println("   " + toppings.get(i));
		}
	}
	
	/**
	 * 烘焙
	 */
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	/**
	 * 裁切
	 */
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slice");
	}
	
	/**
	 * 包装
	 */
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
