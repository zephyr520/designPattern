package com.zephyr.command.pattern;

/**
 * @description 命令的调用者(Invoker)
 * @author zephyr
 * @date 2019年5月5日
 */
public class Invoker {

	private Command command;
	
	public Invoker() {
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void execute() {
		this.command.execute();
	}
	
	public void undo() {
		this.command.undo();
	}
}
