package com.solid.singleResponsabilityPrinciple.goodExample;

public class ContentString implements IContent {

	private String content;
	
	public ContentString(String content) {
		this.content = content;
	}
	
	@Override
	public String getAsString() {
		return this.content;
	}
}