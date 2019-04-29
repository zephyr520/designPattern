package com.zephyr.observer.pattern;

/**
 * @description 主题接口
 * @author zephyr
 * @date 2019年4月26日
 */
public interface Subject {
	
	/**
	 * 观察者注册
	 * @param o
	 */
	public void registerObserver(Observer o);
	
	/**
	 * 取消观察者注册
	 * @param o
	 */
	public void removeObserver(Observer o);
	
	/**
	 * 通知所有观察者
	 */
	public void notifyObservers();
}
