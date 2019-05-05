package com.zephyr.command.pattern;

/**
 * @description 命令的接收者(Receiver)
 * @author zephyr
 * @date 2019年5月5日
 */
public class Light {
	
	public void on() {
		System.out.println("开灯");
	}
	
	public void off() {
		System.out.println("关灯");
	}
}
