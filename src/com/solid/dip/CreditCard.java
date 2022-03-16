package com.solid.dip;

public class CreditCard implements BankCard {

	@Override
	public void doTransaction(long amount) {
		System.out.println("paying " + amount + " using credit card");
	}
}