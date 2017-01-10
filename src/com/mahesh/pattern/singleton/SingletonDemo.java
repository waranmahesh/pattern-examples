package com.mahesh.pattern.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		CacheLoader cache = CacheLoader.getInstance();
		System.out.println(cache.getData());
	}
}
