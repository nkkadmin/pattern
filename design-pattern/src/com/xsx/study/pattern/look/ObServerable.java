package com.xsx.study.pattern.look;

/**
 * ���󱻹۲��߽ӿ� ������ӣ�ɾ����֪ͨ�۲��߷���
 * 
 * @author xsx
 *
 */
public interface ObServerable {

	public void redisterObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObserver();
}
