package com.xsx.study.pattern.look;

import java.util.List;
import java.util.Scanner;

/**
 * 测试
 * 
 * @author xsx
 *
 */
public class Test {

	static WechatServer wechatServer = new WechatServer();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("欢迎使用微信公众号服务");
		try {
			while (true) {
				wechatServer.online();
				System.out.println("操作提示：");
				System.out.println("注册请输入1\t注销请输入2\t查看当前已经注册的用户3\t发布消息请输入4\t退出程序0");
				Integer oper = scanner.nextInt();
				scanner.nextLine();
				if (oper == 1) {
					System.out.println("请输入注册用户名");
					String name = scanner.nextLine();
					addUser(name);
				} else if (oper == 2) {
					System.out.println("请输入要注销的用户名");
					String name = scanner.nextLine();
					removeUser(name);
				} else if (oper == 3) {
					onlineUser();
				} else if (oper == 4) {
					System.out.println("请输入发布的消息");
					String message = scanner.nextLine();
					wechatServer.setInfomation(message);
				} else if (oper == 0) {
					System.out.println("退出程序");
					break;
				} else {
					System.out.println("输入错误！");
				}
			}
		} catch (Exception e) {
			System.out.println("退出程序");
		}
	}
	
	private static void onlineUser() {
		List<Observer> list = wechatServer.getAllObserver();
		for(Observer o : list) {
			System.out.print((User)o + " ");
		}
	}

	/**
	 * 判断该用户是否存在
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
			System.out.println("【"+name+"】注销成功");
		}else {
			System.out.println("【"+name+"】注销失败，该用户不存在");
		}
	}

	private static void addUser(String name) {
		if(findByName(name) == null) {
			wechatServer.redisterObserver(new User(name));
			System.out.println("【"+name+"】注册成功");
		}else {
			System.out.println("【"+name+"】注册失败，该用户名已存在");
		}
	}

}
