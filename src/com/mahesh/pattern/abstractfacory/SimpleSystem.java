package com.mahesh.pattern.abstractfacory;

public class SimpleSystem implements Equipment {

	@Override
	public void generate() {
		System.out.println("Generate Number");
	}

}
