package com.mahesh.pattern.abstractfacory;

public class Branch implements Location {

	@Override
	public void create() {
		System.out.println("Branch");
	}

}
