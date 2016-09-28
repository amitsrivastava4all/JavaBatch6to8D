
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=90;
		Employee ram = new Employee();
		ram.print();
		// ram is a reference variable
//		System.out.println("Id "+ram.id);  // 77.id
//		System.out.println("Name "+ram.name);
//		System.out.println("Salary "+ram.salary);
//		
		ram.takeInput(1001, "Ram", 9999);
		//ram.id = -1001; // 77.id = 1001
		//ram.name = "Ram";
		//ram.salary = -9999;
		
		
		System.out.println("After Change...");
		ram.print();
//		System.out.println("Id "+ram.id);  // 77.id
//		System.out.println("Name "+ram.name);
//		System.out.println("Salary "+ram.salary);
		
		System.out.println("Shyam Data");
		Employee shyam = new Employee();
		shyam.print();
//		System.out.println("Id "+shyam.id);  // 77.id
//		System.out.println("Name "+shyam.name);
//		System.out.println("Salary "+shyam.salary);
		
		
		

	}

}
