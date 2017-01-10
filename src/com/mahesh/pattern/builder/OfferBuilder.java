package com.mahesh.pattern.builder;

public class OfferBuilder {

	public Offer prepareProductWithOneTimeService() {
		Offer offer = new Offer();
		offer.addItem(new BuildProduct());
		offer.addItem(new OneTimeService());
		return offer;
	}

	public Offer prepareProductWithRecurringService() {
		Offer offer = new Offer();
		offer.addItem(new BuildProduct());
		offer.addItem(new RecurringService());
		return offer;
	}
}
