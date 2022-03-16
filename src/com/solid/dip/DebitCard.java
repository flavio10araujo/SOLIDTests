package com.solid.dip;

public class DebitCard implements BankCard {

	@Override
	public void doTransaction(long amount) {
		System.out.println("paying " + amount + " using debit card");
	}
}