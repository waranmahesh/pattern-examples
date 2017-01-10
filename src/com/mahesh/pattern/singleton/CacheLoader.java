package com.mahesh.pattern.singleton;

public class CacheLoader {

	private static CacheLoader cache = new CacheLoader();

	private CacheLoader() {
	}

	public static CacheLoader getInstance() {
		return cache;
	}

	public String getData() {
		return "Sample Data";
	}
}
