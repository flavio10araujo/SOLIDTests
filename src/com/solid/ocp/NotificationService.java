package com.solid.ocp;

public interface NotificationService {

	public void sendOTD(String medium);
	
	public void sendTransactionReport(String medium);
}