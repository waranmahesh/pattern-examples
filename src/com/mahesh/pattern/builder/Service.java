package com.mahesh.pattern.builder;

public abstract class Service implements Item {

	@Override
	public Packing packing() {
		return new Contract();
	}

	@Override
	public abstract float price();
}
