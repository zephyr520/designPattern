package com.zephyr.observer.pattern;

/**
 * @description 观察者接口
 * @author zephyr
 * @date 2019年4月26日
 */
public interface Observer {

	/**
	 * 观察者数据更新
	 * @param temperature 温度
	 * @param humidity 湿度
	 * @param pressure 气压
	 */
	public void update(float temperature, float humidity, float pressure);
}
