package com.mahesh.pattern.bridge;

public class TourBus implements BuildAPI {

	@Override
	public void buildBus(int len, int wid, int hei) {
		System.out.println("Building Tour Bus");
	}

}
