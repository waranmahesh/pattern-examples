package com.mahesh.pattern.abstractfacory;

public class EquipmentFactory extends AbstractFactory {

	@Override
	Location getLocation(String locationType) {
		return null;
	}

	@Override
	Equipment getEquipment(String equipmentType) {

		if (equipmentType == null) {
			return null;
		}

		if (equipmentType.equalsIgnoreCase("C")) {
			return new Configurable();
		}

		if (equipmentType.equalsIgnoreCase("S")) {
			return new SimpleSystem();
		}

		return null;
	}

}
