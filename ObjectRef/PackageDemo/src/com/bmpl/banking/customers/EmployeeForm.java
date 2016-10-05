package com.bmpl.banking.customers;

import java.util.Scanner;

import com.bmpl.banking.accounts.Dept;
import com.bmpl.banking.accounts.Report;
// By Default java.lang package is imported already
//import java.lang.String;
public class EmployeeForm {

	public static void main(String[] args) {
		// System.in - this is use to take input from the user
		// Scanner is a Buffer
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = scanner.nextInt(); // id is local variable
		String msg = "Enter the Name";
		System.out.println(msg);
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Enter the Salary");
		double salary = scanner.nextDouble();
		System.out.println("Enter the Bonus");
		double bonus = scanner.nextDouble();
		Employee employeeReference = new Employee(id,name ,salary);
		employeeReference.setBonus(bonus);
		Report report = new Report();
		
		//report.printReport(id,name,salary);
		Dept deptRef = report.printReport(employeeReference);
		System.out.println("Now Updated Salary is "+employeeReference.getSalary());
		System.out.println("Dept Info is ");
		System.out.println(deptRef.getId());
		System.out.println(deptRef.getName());
		System.out.println(deptRef.getHod());
		scanner.close();
	}

}
