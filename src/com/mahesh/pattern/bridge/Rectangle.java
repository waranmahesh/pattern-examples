package com.mahesh.pattern.bridge;

public class Rectangle extends Shape {

	private int len, wid, hei;

	public Rectangle(int len, int wid, int hei, BuildAPI buildAPI) {
		super(buildAPI);
		this.len = len;
		this.wid = wid;
		this.hei = hei;
	}

	@Override
	void build() {
		buildAPI.buildBus(len, wid, hei);
	}
}
