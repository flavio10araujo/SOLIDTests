package com.solid.singleResponsabilityPrinciple.goodExample;

public class ContentHTML implements IContent {

	private String content;
	
	public ContentHTML(String content) {
		this.content = content;
	}
	
	@Override
	public String getAsString() {
		// Some validation here to tranform the HTML content into normal String.
		return this.content;
	}	
}