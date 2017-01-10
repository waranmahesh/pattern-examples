package com.mahesh.pattern.abstractfacory;

public class FactoryCreator {

	public static AbstractFactory createFactory(String type) {

		if (type == null) {

		}
		if (type.equalsIgnoreCase("L")) {
			return new LocationFactory();
		}

		if (type.equalsIgnoreCase("E")) {
			return new EquipmentFactory();
		}
		return null;
	}

}
