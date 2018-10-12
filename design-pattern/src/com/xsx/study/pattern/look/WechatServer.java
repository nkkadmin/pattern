package com.xsx.study.pattern.look;

import java.util.ArrayList;
import java.util.List;

/**
 * ���۲��ߣ�΢�ŷ���ţ�
 * 
 * @author xsx
 *
 */
public class WechatServer implements ObServerable {

	// ע�⵽���List���ϵķ��Ͳ���ΪObserver�ӿڣ����ԭ������ӿڱ�̶���������ʵ�ֱ��
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
		System.out.println("=========΢�ŷ��������Ϣ�� " + s + "=============");
		// ��Ϣ���£�֪ͨ���й۲���
		notifyObserver();
	}
	
	/**
	 * ��ǰע����û�
	 * @return
	 */
	public List<Observer> getAllObserver(){
		return this.list;
	}
	
	/**
	 * ��ǰ��������
	 */
	public void online() {
		System.out.println("��ǰ��������"+this.list.size());
	}

}
