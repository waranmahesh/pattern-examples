package com.mahesh.pattern.adaptor;

public class AdaptorPatternDemo {

	public static void main(String[] args) {
		FileCreator fileCreator = new FileCreator();
		fileCreator.generateXML("Std", "Std.xml");
		fileCreator.generateXML("One", "One.xml");
		fileCreator.generateXML("Two", "two.xml");
	}

}
