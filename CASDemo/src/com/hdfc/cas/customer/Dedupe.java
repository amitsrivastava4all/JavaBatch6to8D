package com.hdfc.cas.customer;

public class Dedupe {
	
	private Customer customers[] ;
	int x[] = new int[5];
	public Dedupe(){
		buildDBForNegativeCustomers();
	}
	private void buildDBForNegativeCustomers(){
		customers = new Customer[5];
		int y = 1000;
		x[0]=y;
		for(int i = 0; i<5; i++){
		Customer customer = new Customer();
		customer.setAge(21+i);
		customer.setEmail("ram"+i+"@gmail.com");
		customer.setPhone("222"+i);
		customers[i] = customer;
		}
//		customer = new Customer();
//		customer.setAge(21);
//		customer.setEmail("shyam@gmail.com");
//		customer.setPhone("3333");
//		customers[1] = customer;
		
		//customers[0]  = new Customer();
		//customers[0].setAge(21);
		//customers[0].setEmail("ram@gmail.com");
	}
	/**
	 * @param customer , this will rec customer object as a parameter
	 * and compare customer object with array
	 * @return int and this will return the calculated dedupe score
	 */
	public int dedupeScore(Customer customer){
		int score = 0;
		for(Customer customerObject : customers){
			if(customerObject.getAge()==customer.getAge()){
				score = score + 10;
			}
			
			if(customerObject.getEmail().equals(customer.getEmail())){	
				score = score + 5;
			}
		}
		return score;
	}

}
