package com.mahesh.pattern.adaptor;

public class OneXMLGenerator implements AdvancedXMLGenerator {

	@Override
	public void generateXMLOne(String fileName) {
		System.out.println("Generate XML One" + fileName);
	}

}
