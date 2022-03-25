package com.solid.singleResponsabilityPrinciple.badExample;

public class Email implements IEmail {

	private String content;
	
	@Override
	public void setSender(String sender) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setReceiver(String receiver) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return this.content;
	}
}