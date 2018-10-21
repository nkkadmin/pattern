package com.xsx.study.pattern.factory;

public class Test {

	public static void main(String[] args) {
		
		CadFactory factory = new CadFactory();
		
		Cad aodi = factory.getCad("AODI");
		aodi.create();
		
		Cad bentian = factory.getCad("BENTIAN");
		bentian.create();
	}

}
