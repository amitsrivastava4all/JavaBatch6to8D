package com.hdfc.test;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import com.hdfc.loans.HomeLoan;
import com.hdfc.loans.Loan;

public class CallLoans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan loan = new HomeLoan();
		int t[] = new int[100];
		loan.emi();
		BigInteger b = new BigInteger("123456789123456789123456789");
		BigInteger b2 = new BigInteger("123456789123456789123456789");
		//BigInteger b3 = b + b2;
		System.out.println(b);
		System.out.println(b.add(b2));
		double p = 1212121212121211111192121231.9112132322;
		double x = 2121212121212121.9090909;
		double z = p *x;
		System.out.println(z);
		double amount = 900000.00;
		//int x = 100000000000;
		// I18N
		System.out.println("हिन्दी प्रेस 1 के लिए ");
		System.out.println("Press 2 for English");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		Locale locale =null;
		if(choice ==1){
			 locale =new Locale("hi","IN");
		}
		else
		if(choice == 2){	
			locale =new Locale("en","US");
		}
		// to read the property file
		ResourceBundle rb = ResourceBundle.getBundle("messages",locale);
		System.out.println(rb.getString("firstno"));
		int firstno = scanner.nextInt();
		System.out.println(rb.getString("secondno"));
		int secondno =scanner.nextInt();
		int result = firstno + secondno;
		System.out.println(rb.getString("result")+" "+result);
		//System.out.println("नमस्ते");
		Date date = new Date();
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, locale);
		String formattedDate =df.format(date);
		System.out.println("Simple Date "+date);
		System.out.println("After Format "+formattedDate);
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
		String formattedAmount = numberFormat.format(amount);
		System.out.println(formattedAmount);
	}

}
