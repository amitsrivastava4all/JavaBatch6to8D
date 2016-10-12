/*
 * In Case of Classes there is no Multiple Inheritance , But in case 
 * of Interface there is Multiple Inheritance
 */
class A1
{
	int x= 1000;
	void print(){
		System.out.println("A1 Print");
	}
	A1(){
		System.out.println("A1 Default Cons Call");
	}
	A1(int x){
		System.out.println("A1 Param Cons Call");
	}
}
class A2 extends A1
{
	int x = 2000;
//	A2(){
//		// super();
//		System.out.println("A2 Default Cons Call");
//		
//	}
	A2(int x){
		super(800);
		System.out.println("A2 Param Cons Call");
	}
	void print(){
		System.out.println("A2 Print");
	}
}
class B1 extends A2{
	B1(){
		super(999);
		//super();
		System.out.println("B1 Default Cons call");
	}
	B1(int x){
		// super();
		super(900);
		System.out.println("B1 Param Cons Call");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj = new B1(1000);

	}

}
