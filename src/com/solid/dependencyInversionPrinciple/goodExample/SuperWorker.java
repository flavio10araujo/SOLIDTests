package com.solid.dependencyInversionPrinciple.goodExample;

public class SuperWorker implements IWorker {

	@Override
	public void work() {
		System.out.println("working (specialized)...");	
	}
}