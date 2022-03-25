package com.solid.dependencyInversionPrinciple.goodExample;

/**
 * This is the a code which supports the Dependency Inversion Principle. 
 * In this design an abstraction layer is added through the IWorker Interface. 
 * Now the problems from badExample code are solved:
 * - Manager class doesn't require changes when adding SuperWorkers.
 * - Minimized risk to affect old functionality present in Manager class since we don't change it.
 * - No need to redo the unit testing for Manager class.
 */
public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setWorker(new Worker());
		manager.manage();
		
		manager.setWorker(new SuperWorker());
		manager.manage();
	}
}