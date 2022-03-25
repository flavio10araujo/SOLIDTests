package com.solid.singleResponsabilityPrinciple.badExample;

public interface IEmail {

	public void setSender(String sender);
	public void setReceiver(String receiver);
	public void setContent(String content);
}