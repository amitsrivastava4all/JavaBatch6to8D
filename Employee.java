/*
 * OOAD - Object Oriented Analysis and Designing
 * S O L I D
 * S - SRP
 * D - Don't Repeat YourSelf 
 */

/*
 * OOPS Principles
 * Encapsulation - Binding Data (Variables) with Methods (Functions)
 * e.g class is an example of Encapsulation
 * Good Encapsulation - private member variables 
 * and public member methods
 * Data Hiding
 */
public class Employee {
	// private - scope is now limited to the class
	// by default - it is called default scope - the scope is with in 
	// the folder (package)
	private int id;  // Member Variables
	private String name;
	private double salary;
	
	// it will take the value from the main class
	// and store it in local variables
	// local variables give the value to the class member variables
	public void takeInput(int id , String name , double salary){
		if(id>0 && salary>0){
		this.id = id;
		this.name = name;
		this.salary = salary;
		}
		else
		{
			System.out.println("Invalid Id or Salary Can't take wrong data");
		}
	}
	public void print(){
		//ram.print()  --> print this
		System.out.println("EMP Id "+id);  
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
		
	}
	

}
