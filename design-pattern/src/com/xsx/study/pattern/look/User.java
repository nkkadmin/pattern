package com.xsx.study.pattern.look;

/**
 * �۲���
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
		System.out.println(name + "�յ�������Ϣ��" + message);
	}

	@Override
	public String toString() {
		return name;
	}
	
}
