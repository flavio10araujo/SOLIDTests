package com.solid.dependencyInversionPrinciple.badExample;

public class Manager {

	Worker worker;
	
	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	
	public void manage() {
		worker.work();
	}
}