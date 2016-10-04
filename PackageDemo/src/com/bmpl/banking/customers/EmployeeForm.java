package com.bmpl.banking.customers;

import java.util.Scanner;
// By Default java.lang package is imported already
//import java.lang.String;
public class EmployeeForm {

	public static void main(String[] args) {
		// System.in - this is use to take input from the user
		// Scanner is a Buffer
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = scanner.nextInt();
		System.out.println("Enter the Name");
		String name = scanner.next();
		System.out.println("Enter the Salary");
		double salary = scanner.nextDouble();
		System.out.println("Id "+id+" Name "+name +" Salary "+salary);
		scanner.close();
	}

}
