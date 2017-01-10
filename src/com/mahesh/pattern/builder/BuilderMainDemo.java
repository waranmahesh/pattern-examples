package com.mahesh.pattern.builder;

public class BuilderMainDemo {

	public static void main(String[] args) {
		OfferBuilder offerBuilder = new OfferBuilder();
		Offer oneTime = offerBuilder.prepareProductWithOneTimeService();
		oneTime.showItems();
		Offer recurring = offerBuilder.prepareProductWithRecurringService();
		recurring.showItems();
	}
}
