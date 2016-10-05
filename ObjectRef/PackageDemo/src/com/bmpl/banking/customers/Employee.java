package com.bmpl.banking.customers;

public class Employee {
private int id;
private String name;
private double salary;
private double bonus;

Employee(int id , String name, double salary){
	this.id = id ;
	this.name = name;
	this.salary = salary;
}


public double getBonus() {
	return bonus;
}


public void setBonus(double bonus) {
	this.bonus = bonus;
}


public int getId() {
	return id;
}

public void setId(int id) {
	if(id>0){
	this.id = id;
	}
	else
	{
		System.out.println("Invalid Id...");
	}
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}



}
