package com.mahesh.pattern.adaptor;

public class XMLAdaptor implements XMLGenerator {

	AdvancedXMLGenerator advancedXMLGenerator;

	public XMLAdaptor(String type) {
		if (type.equalsIgnoreCase("One")) {
			advancedXMLGenerator = new OneXMLGenerator();
		}
	}

	@Override
	public void generateXML(String type, String fileName) {
		if (type.equalsIgnoreCase("One")) {
			advancedXMLGenerator.generateXMLOne(fileName);
		}
	}

}
