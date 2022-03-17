package com.solid.teste.loan;

public class CarLoan implements ILoan {

	@Override
	public void getLoanInterestInfo() {
		System.out.println("emprestou car");
	}
}