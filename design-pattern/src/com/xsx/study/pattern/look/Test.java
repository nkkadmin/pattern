package com.xsx.study.pattern.look;

import java.util.List;
import java.util.Scanner;

/**
 * ����
 * 
 * @author xsx
 *
 */
public class Test {

	static WechatServer wechatServer = new WechatServer();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ӭʹ��΢�Ź��ںŷ���");
		try {
			while (true) {
				wechatServer.online();
				System.out.println("������ʾ��");
				System.out.println("ע��������1\tע��������2\t�鿴��ǰ�Ѿ�ע����û�3\t������Ϣ������4\t�˳�����0");
				Integer oper = scanner.nextInt();
				scanner.nextLine();
				if (oper == 1) {
					System.out.println("������ע���û���");
					String name = scanner.nextLine();
					addUser(name);
				} else if (oper == 2) {
					System.out.println("������Ҫע�����û���");
					String name = scanner.nextLine();
					removeUser(name);
				} else if (oper == 3) {
					onlineUser();
				} else if (oper == 4) {
					System.out.println("�����뷢������Ϣ");
					String message = scanner.nextLine();
					wechatServer.setInfomation(message);
				} else if (oper == 0) {
					System.out.println("�˳�����");
					break;
				} else {
					System.out.println("�������");
				}
			}
		} catch (Exception e) {
			System.out.println("�˳�����");
		}
	}
	
	private static void onlineUser() {
		List<Observer> list = wechatServer.getAllObserver();
		for(Observer o : list) {
			System.out.print((User)o + " ");
		}
	}

	/**
	 * �жϸ��û��Ƿ����
	 * @param name
	 * @return
	 */
	public static Observer findByName(String name) {
		List<Observer> list = wechatServer.getAllObserver();
		for(Observer o : list) {
			User user = (User)o;
			if(user.getName().equals(name)) {
				return o;
			}
		}
		return null;
	}
	

	private static void removeUser(String name) {
		if(name != null) {
			Observer o = findByName(name);
			wechatServer.removeObserver(o);
			System.out.println("��"+name+"��ע���ɹ�");
		}else {
			System.out.println("��"+name+"��ע��ʧ�ܣ����û�������");
		}
	}

	private static void addUser(String name) {
		if(findByName(name) == null) {
			wechatServer.redisterObserver(new User(name));
			System.out.println("��"+name+"��ע��ɹ�");
		}else {
			System.out.println("��"+name+"��ע��ʧ�ܣ����û����Ѵ���");
		}
	}

}
