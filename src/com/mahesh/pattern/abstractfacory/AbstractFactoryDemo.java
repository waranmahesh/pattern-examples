package com.mahesh.pattern.abstractfacory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		AbstractFactory locationFactory = FactoryCreator.createFactory("L");
		AbstractFactory equipmentFactory = FactoryCreator.createFactory("E");
		Location location = locationFactory.getLocation("M");
		location.create();
		Equipment equipment = equipmentFactory.getEquipment("C");
		equipment.generate();
	}

}
