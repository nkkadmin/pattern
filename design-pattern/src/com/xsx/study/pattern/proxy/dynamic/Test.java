package com.xsx.study.pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

import com.xsx.study.pattern.proxy.BuyHouse;
import com.xsx.study.pattern.proxy.BuyHouseImpl;

/**
 * 测试类
 * @author xieshengxiang
 *
 */
public class Test {

	
	public static void main(String[] args) {
		BuyHouse buyHouse = new BuyHouseImpl();
		
		BuyHouse house = (BuyHouse)Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new Class[] {BuyHouse.class}, new DynamicProxyHandler(buyHouse));
		house.buyHouse();
	}
}
