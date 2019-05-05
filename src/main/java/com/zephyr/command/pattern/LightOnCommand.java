package com.zephyr.command.pattern;

/**
 * @description 实现一个打开电灯的命令
 * @author zephyr
 * @date 2019年5月5日
 */
public class LightOnCommand implements Command {
	
	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		this.light.on();
	}

	public void undo() {
		this.light.off();
	}

}
