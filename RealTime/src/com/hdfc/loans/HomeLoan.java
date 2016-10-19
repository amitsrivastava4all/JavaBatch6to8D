package com.hdfc.loans;

public class HomeLoan extends Loan {
	public HomeLoan(){
		System.out.println("this is my homeloan default cons");
	}
	@Override
	public void emi(){
		System.out.println("HomeLoan EMI Logic...");
	}
}
