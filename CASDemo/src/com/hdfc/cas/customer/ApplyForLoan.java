package com.hdfc.cas.customer;

import java.util.Scanner;

 class T{
	
}
 class M extends T{
	 
 }
public class ApplyForLoan {

	public static void main(String[] args) {
		T obj  = new M();
		Customer customer = new Customer();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = scanner.nextInt();
		customer.setId(id);
		System.out.println("Enter the Name");
		customer.setName(scanner.next());
		System.out.println("Enter the Age");
		customer.setAge(scanner.nextInt());
		System.out.println("Enter the Email");
		customer.setEmail(scanner.next());
		Dedupe dedupe = new Dedupe();
		int score = dedupe.dedupeScore(customer);
		System.out.println("Dedupe Score is "+score);
		// TODO Auto-generated method stub

	}

}
