package com.xsx.study.pattern.factory;

public class CadFactory {

	private final String AODI = "AODI";
	private final String BENTIAN = "BENTIAN";
	
	private Cad cad;
	
	public Cad getCad(String cadType) {
		if(cadType == null) {
			return null;
		}
		if(cadType.equals(AODI)){
			return new Aodi();
		}else if(cadType.equals(BENTIAN)) {
			return new BenTian();
		}else {
			return null;
		}
	}
	
	public void create() {
		cad.create();
	}
}
