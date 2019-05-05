package com.zephyr.command.pattern;

/**
 * @description 命令接口
 * @author zephyr
 * @date 2019年5月5日
 */
public interface Command {

	public void execute();
	
	public void undo();
}
