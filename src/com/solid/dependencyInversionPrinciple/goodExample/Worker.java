package com.solid.dependencyInversionPrinciple.goodExample;

public class Worker implements IWorker {

	@Override
	public void work() {
		System.out.println("working...");	
	}
}