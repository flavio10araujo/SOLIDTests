package com.solid.teste.loan;

public class PersonalLoan implements ILoan {

	@Override
	public void getLoanInterestInfo() {
		System.out.println("emprestou personalLoan");
	}
}