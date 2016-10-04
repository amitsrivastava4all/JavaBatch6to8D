package com.bmpl.banking.customers;

import com.bmpl.banking.accounts.SavingAccount;

public class Customer {
	public static void main(String[] args) {
		// Calling one Class from another Class 
		// by making object of another class  (Has-A RelationShip)
		SavingAccount sa  = new SavingAccount();
		String message = sa.withDraw(999);
		System.out.println(message);
		
	}

}
