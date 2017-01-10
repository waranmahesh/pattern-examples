package com.mahesh.pattern.abstractfacory;

public class Configurable implements Equipment {

	@Override
	public void generate() {
		System.out.println("Generate Number");
	}

}
