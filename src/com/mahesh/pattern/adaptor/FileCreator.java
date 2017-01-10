package com.mahesh.pattern.adaptor;

public class FileCreator implements XMLGenerator {

	@Override
	public void generateXML(String type, String fileName) {

		XMLAdaptor xmlAdaptor;
		if (type.equalsIgnoreCase("Std")) {
			System.out.println("Create standard one");
		} else if (type.equalsIgnoreCase("One")) {
			xmlAdaptor = new XMLAdaptor(type);
			xmlAdaptor.generateXML(type, fileName);
		} else {
			System.out.println("Invalid Type");
		}
	}

}
