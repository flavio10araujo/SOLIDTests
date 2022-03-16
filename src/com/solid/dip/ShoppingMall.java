package com.solid.dip;

public class ShoppingMall {

	private BankCard bankCard;
	
	public ShoppingMall(BankCard bankCard) {
		this.bankCard = bankCard;
	}
	
	public void doPurchaseSomething(long amount) {
		bankCard.doTransaction(amount);
	}
	
	public static void main(String args[]) {
		BankCard debit = new DebitCard();
		BankCard credit = new CreditCard();
		
		ShoppingMall s1 = new ShoppingMall(debit);
		s1.doPurchaseSomething(500);
		
		ShoppingMall s2 = new ShoppingMall(credit);
		s2.doPurchaseSomething(500);
	}
}