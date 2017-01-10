package com.mahesh.pattern.builder;

public abstract class Product implements Item {
	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
