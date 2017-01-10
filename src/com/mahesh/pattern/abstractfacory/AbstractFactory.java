package com.mahesh.pattern.abstractfacory;

public abstract class AbstractFactory {

	abstract Location getLocation(String locationType);

	abstract Equipment getEquipment(String equipmentType);
}
