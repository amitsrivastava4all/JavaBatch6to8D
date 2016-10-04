package com.bmpl.banking.customers;

import com.bmpl.banking.accounts.A;

public class B extends A {
	
	void print(){
		System.out.println(super.y);
		System.out.println(super.z);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A obj = new A();
		//obj.z=1000;
		B obj = new B();
		obj.print();
		
		

	}

}
