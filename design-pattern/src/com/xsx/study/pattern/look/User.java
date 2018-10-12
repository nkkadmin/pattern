package com.xsx.study.pattern.look;

/**
 * 观察者
 * 
 * @author xsx
 *
 */
public class User implements Observer {

	private String message;
	private String name;

	public User(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void update(String message) {
		this.message = message;
		read();
	}

	private void read() {
		System.out.println(name + "收到推送消息：" + message);
	}

	@Override
	public String toString() {
		return name;
	}
	
}
