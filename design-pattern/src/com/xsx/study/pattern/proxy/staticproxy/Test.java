package com.xsx.study.pattern.proxy.staticproxy;

import com.xsx.study.pattern.proxy.BuyHouse;
import com.xsx.study.pattern.proxy.BuyHouseImpl;

/**
 * 测试
 * @author xieshengxiang
 *
 */
public class Test {

	public static void main(String[] args) {
		BuyHouse house = new BuyHouseImpl();
		
		BuyHouseProxy proxy = new BuyHouseProxy(house);
		
		proxy.buyHouse();
	}
}
