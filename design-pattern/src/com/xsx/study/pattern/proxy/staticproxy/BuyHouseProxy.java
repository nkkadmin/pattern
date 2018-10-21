package com.xsx.study.pattern.proxy.staticproxy;

import com.xsx.study.pattern.proxy.BuyHouse;

/**
 * 代理类
 * @author xieshengxiang
 *
 */
public class BuyHouseProxy implements BuyHouse{
	
	BuyHouse buyHouse = null;
	
	public BuyHouseProxy(final BuyHouse buyHouse) {
		if(this.buyHouse == null)
			this.buyHouse = buyHouse;
	}

	@Override
	public void buyHouse() {
		System.out.println("买房前准备");
		buyHouse.buyHouse();
		System.out.println("买房后装修");
	}

}
