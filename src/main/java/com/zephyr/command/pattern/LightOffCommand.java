package com.zephyr.command.pattern;

public class LightOffCommand implements Command {
	
	private Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		this.light.off();
	}

	public void undo() {
		this.light.on();
	}

}
