package com.xsx.study.pattern.proxy.cglibproxy;

import com.xsx.study.pattern.proxy.BuyHouseImpl;

public class Test {

	public static void main(String[] args) {
		CglibProxy cglibProxy = new CglibProxy();
		BuyHouseImpl pro = (BuyHouseImpl)cglibProxy.getInstance(new BuyHouseImpl());
		pro.buyHouse();
	}
}
