
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=90;
		//Employee ram = new Employee();
		Employee ram = new Employee(1001,"Ram",9999);
		ram.setSalary(ram.getSalary()+1000);
		System.out.println("Now "+ram.getName()+" Salary "+ram.getSalary());
		//ram.print();
		
		Employee shyam = new Employee(1002,"Shyam",7777);
		//shyam.print();
		// ram is a reference variable
//		System.out.println("Id "+ram.id);  // 77.id
//		System.out.println("Name "+ram.name);
//		System.out.println("Salary "+ram.salary);
//		
		//ram.takeInput(1001, "Ram", 9999);
		//ram.id = -1001; // 77.id = 1001
		//ram.name = "Ram";
		//ram.salary = -9999;
		
		
		//System.out.println("After Change...");
		//ram.print();
//		System.out.println("Id "+ram.id);  // 77.id
//		System.out.println("Name "+ram.name);
//		System.out.println("Salary "+ram.salary);
		
		//System.out.println("Shyam Data");
		//Employee shyam = new Employee();
		//shyam.print();
//		System.out.println("Id "+shyam.id);  // 77.id
//		System.out.println("Name "+shyam.name);
//		System.out.println("Salary "+shyam.salary);
		
		
		

	}

}
