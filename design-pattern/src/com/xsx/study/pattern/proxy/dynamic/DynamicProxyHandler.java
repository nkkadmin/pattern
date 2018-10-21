package com.xsx.study.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 * @author xieshengxiang
 *
 */
public class DynamicProxyHandler implements InvocationHandler{
	
	private Object obj;
	
	public DynamicProxyHandler(Object obj) {
		if(this.obj == null)
			this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("买房前准备");
		Object result = method.invoke(obj, args);
		System.out.println("买房后装修");
		return result;
	}

}
