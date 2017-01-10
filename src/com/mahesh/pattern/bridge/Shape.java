package com.mahesh.pattern.bridge;

public abstract class Shape {

	protected BuildAPI buildAPI;

	protected Shape(BuildAPI buildAPI) {
		this.buildAPI = buildAPI;
	}

	abstract void build();
}
