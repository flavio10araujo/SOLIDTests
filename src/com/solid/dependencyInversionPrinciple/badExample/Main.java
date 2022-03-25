package com.solid.dependencyInversionPrinciple.badExample;

/**
 * This is an example which violates the Dependency Inversion Principle. 
 * We have the Manager class which is a high level class, and the low level class called Worker. 
 * 
 * We need to add a new module to our application to model the changes in the company structure determined by the employment of new specialized workers. 
 * Let's say that we are going to create a new class called SuperWorker for this.
 * 
 * Let's assume the Manager class is quite complex, containing very complex logic. 
 * And now we have to change it in order to introduce the new SuperWorker. 
 * 
 * Let's see the disadvantages:
 * - we have to change the Manager class (remember it is a complex one and this will involve time and effort to make the changes).
 * - some of the current functionality from the Manager class might be affected.
 * - the unit testing should be redone.
 * 
 * All those problems could take a lot of time to be solved and they might induce new errors in the old functionality. 
 * The situation would be different if the application had been designed following the Dependency Inversion Principle.
 */
public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setWorker(new Worker());
		manager.manage();
	}
}