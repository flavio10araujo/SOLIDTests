package com.solid.singleResponsabilityPrinciple.goodExample;

public class Email implements IEmail {

	private IContent content;
	
	@Override
	public void setSender(String sender) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void setReceiver(String receiver) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setContent(IContent content) {
		this.content = content;
	}
	
	public String getContent() {
		return this.content.getAsString();
	}
}