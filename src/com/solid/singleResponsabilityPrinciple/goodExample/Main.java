package com.solid.singleResponsabilityPrinciple.goodExample;

/**
 * To solve the problem created in the badExample:
 * 
 * We can create a new interface and class called IContent and Content to split the responsibilities.
 * 
 * Having only one responsibility for each class give us a more flexible design:
 * - adding a new protocol causes changes only in the Email class.
 * - adding a new type of content supported causes changes only in Content class.
 */
public class Main {

	public static void main(String[] args) {
		Email email = new Email();
		email.setContent(new ContentString("Hello world"));
		
		System.out.println(email.getContent());
		
		email.setContent(new ContentHTML("<b>Hello world</b>"));
		
		System.out.println(email.getContent());
	}
}