package com.xsx.study.pattern.look;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者（微信服务号）
 * 
 * @author xsx
 *
 */
public class WechatServer implements ObServerable {

	// 注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
	private List<Observer> list;
	private String message;

	public WechatServer() {
		this.list = new ArrayList<Observer>();
	}

	@Override
	public void redisterObserver(Observer o) {
		if(o != null) {
			list.add(o);
		}
	}

	@Override
	public void removeObserver(Observer o) {
		if (!list.isEmpty())
			list.remove(o);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : list)
			observer.update(message);
	}

	public void setInfomation(String s) {
		this.message = s;
		System.out.println("=========微信服务更新消息： " + s + "=============");
		// 消息更新，通知所有观察者
		notifyObserver();
	}
	
	/**
	 * 当前注册的用户
	 * @return
	 */
	public List<Observer> getAllObserver(){
		return this.list;
	}
	
	/**
	 * 当前在线人数
	 */
	public void online() {
		System.out.println("当前在线人数"+this.list.size());
	}

}
