package com.solid.dependencyInversionPrinciple.goodExample;

public class Manager {

	IWorker worker;
	
	public void setWorker(IWorker worker) {
		this.worker = worker;
	}
	
	public void manage() {
		worker.work();
	}
}