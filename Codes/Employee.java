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
	private String companyName;
	private String managerName;
	private double bonus;
	
	
	
	
	public int getId() {
		return id;
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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	{
		//System.out.println("I am Init Block and I Will Call Before Constructor Call");
		//System.out.println("(Init Block ) Id "+id+" Name "+name+" Salary "+salary);
	}
	/*
	 * Constructor is Call when object is created
	 * Constructor name is same as class name
	 * Every class has default constructor by default
	 * If u create any other constructor so default is kill automatically
	 * It is used to initalize the instance variables
	 * It doesn't return anything
	 */
	
	// this is default Constructor
	Employee(){
		//this(1001,"Ram",8888);
		companyName = "Oracle";
		//System.out.println(" I am the Default Constructor");
	}
	
	// Constructor Overloading
	// this is Parameterized Constructor
	Employee(int id , String name , double salary){
		  // now it is calling default constructor
		this(); // Constructor Chaining
		this.id = id + companyName.length();
		this.name = name;
		this.salary = salary;
		
		
	}
	
	// it will take the value from the main class
	// and store it in local variables
	// local variables give the value to the class member variables
//	public void takeInput(int id , String name , double salary){
//		if(id>0 && salary>0){
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		}
//		else
//		{
//			System.out.println("Invalid Id or Salary Can't take wrong data");
//		}
//	}
//	public void print(){
//		//ram.print()  --> print this
//		System.out.println("EMP Id "+id);  
//		System.out.println("Name "+name);
//		System.out.println("Salary "+salary);
//		System.out.println("Company "+companyName);
//		
//	}
	

}
