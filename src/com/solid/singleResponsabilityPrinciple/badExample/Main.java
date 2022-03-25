package com.solid.singleResponsabilityPrinciple.badExample;

/**
 * The Single Responsibility Principle is a simple and intuitive principle, but in practice it is sometimes hard to get it right.
 * 
 * Objective: A class should have only one reason to change.
 * 
 * Let's assume we need an object to keep an email message. 
 * We are going to use the IEmail interface. 
 * At the first sight everything looks just fine. 
 * At a closer look we can see that our IEmail interface and Email class have 2 responsibilities (2 reasons to change):
 * 	 - One would be the use of the class in some email protocols such as POP3 or IMAP.
 * 	   If other protocols must be supported the objects should be serialized in another manner and code should be added to support new protocols.
 *   - Another one would be for the Content field. 
 *     Even if content is a string maybe we want in the future to support HTML or other formats.
 *     
 * If we keep only one class, each change for a responsibility might affect the other one:
 * - Adding a new protocol will create the need to add code for parsing and serializing the content for each type of field.
 * - Adding a new content type (like HTML) make us to add code for each protocol implemented.
 */
public class Main {

	public static void main(String[] args) {
		Email email = new Email();
		email.setContent("Hello world");
		
		System.out.println(email.getContent());
	}
}