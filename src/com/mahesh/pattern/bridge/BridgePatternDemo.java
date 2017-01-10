package com.mahesh.pattern.bridge;

public class BridgePatternDemo {

	public static void main(String[] args) {

		Shape schoolShape = new Rectangle(10, 10, 1, new SchoolBus());
		Shape tourShape = new Rectangle(10, 10, 1, new TourBus());
		
		schoolShape.build();
		tourShape.build();

	}

}
