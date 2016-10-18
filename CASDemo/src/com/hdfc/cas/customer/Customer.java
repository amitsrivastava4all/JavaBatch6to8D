package com.hdfc.cas.customer;
/**
 * This is Customer Class , it take customer data
 * @author  Amit Srivastava
* @version 1.0
* @since   2016-03-31 
 */
public class Customer {
	/**
	 * this represent customer id
	 */
	private int id;
	private String name;
	private String email;
	private String phone;
	private double income;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public int getAge() {
		return age;
	}
	/**
	 * this method used to set the Age
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
