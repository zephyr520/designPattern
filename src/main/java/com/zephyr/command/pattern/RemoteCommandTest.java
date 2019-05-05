package com.zephyr.command.pattern;

public class RemoteCommandTest {

	public static void main(String[] args) {
		Light light = new Light();
		Command command = new LightOnCommand(light);
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.execute();
		invoker.undo();
		
		command = new LightOffCommand(light);
		invoker.setCommand(command);
		invoker.execute();
		invoker.undo();
	}
}
