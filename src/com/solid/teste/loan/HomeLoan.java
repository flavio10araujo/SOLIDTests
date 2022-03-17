package com.solid.teste.loan;

public class HomeLoan implements ILoan {

	@Override
	public void getLoanInterestInfo() {
		System.out.println("emprestou homeLoan");	
	}
}