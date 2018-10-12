package com.xsx.study.pattern.look;

/**
 * 抽象被观察者接口 声明添加，删除，通知观察者方法
 * 
 * @author xsx
 *
 */
public interface ObServerable {

	public void redisterObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObserver();
}
