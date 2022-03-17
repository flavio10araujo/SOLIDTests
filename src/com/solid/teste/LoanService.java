package com.solid.teste;

import com.solid.teste.loan.LoanFactory;

public class LoanService {

	/*public void getLoanInterestInfo(String loanType) {
		if (loanType.equals("homeLoan")) {
			System.out.println("emprestou homeLoan");
		} else if (loanType.equals("personalLoan")) {
			System.out.println("emprestou personalLoan");
		} else if (loanType.equals("car")) {
			System.out.println("emprestou car");
		}
	}*/
	
	public void getLoanInterestInfo(String loanType) {
		try {
			LoanFactory.getLoan(loanType).orElseThrow(() -> new IllegalArgumentException("Wrong condition")).getLoanInterestInfo();
		} catch(IllegalArgumentException e) {
			System.out.println("Opção inválida.");
		}
	}
}