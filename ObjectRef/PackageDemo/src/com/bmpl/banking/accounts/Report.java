package com.bmpl.banking.accounts;

import com.bmpl.banking.customers.Employee;

public class Report {
	public Dept  printReport(Employee recReference){
	//public void printReport(int id , String name , double salary){
		//System.out.println("Id "+id+" Name "+name +" Salary "+salary);
		recReference.setSalary(recReference.getSalary()+1000);
		System.out.println("Id "+recReference.getId()+" Name "
		+recReference.getName()+" Salary "+recReference.getSalary()+" Bonus "+recReference.getBonus());
		Dept dept = new Dept();
		dept.setId(10);
		dept.setName("IT");
		dept.setHod("Mr X");
		return dept;
		//return 10;
	}

}
