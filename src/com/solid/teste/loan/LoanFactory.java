package com.solid.teste.loan;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class LoanFactory {

	static Map<String, ILoan> types = new HashMap<>();
	
	static {
		types.put("homeLoan", new HomeLoan());
		types.put("personalLoan", new PersonalLoan());
		types.put("car", new CarLoan());
		types.put("foreign", new ForeignLoan());
	}
	
	public LoanFactory() {
	}
	
	public static Optional<ILoan> getLoan(String condition) {
        return Optional.ofNullable(types.get(condition));
    }
}