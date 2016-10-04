package com.bmpl.banking.accounts;

public class SavingAccount {
	private int balance = 9000;
	boolean checkBalance(double amount){
		return balance>amount?true:false;
	}
	 public String withDraw(double amount){
		 //CurrentAccount ca = new CurrentAccount();
		if(checkBalance(amount)){
		 return "Amount WithDraw is "+amount;
		}
		else
		{
			return "Insufficent Amount ";
		}
	}

}
