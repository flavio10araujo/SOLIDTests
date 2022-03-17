package com.solid.teste.loan;

public class ForeignLoan implements ILoan {

	@Override
	public void getLoanInterestInfo() {
		System.out.println("Foreign loan is more expensive!");
	}
}