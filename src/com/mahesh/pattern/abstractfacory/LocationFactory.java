package com.mahesh.pattern.abstractfacory;

public class LocationFactory extends AbstractFactory {

	@Override
	Location getLocation(String locationType) {
		if (locationType == null) {
			return null;
		}

		if (locationType.equalsIgnoreCase("M")) {
			return new Main();
		}
		if (locationType.equalsIgnoreCase("B")) {
			return new Branch();
		}
		return null;
	}

	@Override
	Equipment getEquipment(String equipmentType) {
		return null;
	}

}
