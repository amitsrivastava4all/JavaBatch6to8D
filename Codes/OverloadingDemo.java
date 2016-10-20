import java.util.LinkedList;

/*
 * Same Method name and arguments are different
 * When arguments are change /different , then overloading
 * search search by id , search by id , name
 * overloading not depend on return type , return type can be anything
 * Rule - Arguments must be of different type
 * Rule - Number of arguments must be different
 * Rule - Position of arguments can be different
 * Overloading is not depend on Inheritance , it can be on same class as well
 * as child class
 * TypePromotion in Overloading
 * start with int
 * Wideing (Primitive Type) Always Win
 * Same Type Wrapper Win
 */



class Calc{
	long add(Long x , Long y){
		System.out.println("Long Wrapper Call...");
		return x + y;
	}
	long add(Integer x , Integer y){
		System.out.println("Wrapper Call...");
		return x + y;
	}
	long add(long x , String y){
		return Long.parseLong(y) + x;
	}
	long add(String x , long y){
		return Long.parseLong(x) + y;
	}
	long add(String x , String y){
		return Long.parseLong(x) + Long.parseLong(y);
	}
long add(long x, long y){
		System.out.println("long calling....");
		return  x +y;
	}
	byte add(byte x, byte y){
		System.out.println("byte calling.....");
		return (byte)(x + y);
	}
	int add(int x, int y ){
		System.out.println("int calling....");
		return x + y;
	}
	int add(int x, int y, int z ){
		return x + y + z;
	}
	double add(int x, int y,int z , int m){
		return x + y + z + m;
	}
}
public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		System.out.println("ADD CALL "+calc.add(100L, 101l));
		int x =100;
		x = 200;
		//Customer customers[] = new Customer[10];
		int salary[] = new int[10];
		salary[3]=9999;
		// Wrapper Classes in Java
		// int (Data Type) (primitive) Integer (Class) (wrapper)
		// long   Long
		// double Double
		// char Character
		// boolean Boolean
		// byte  Byte
		// Predefine Data Structure
		int p = 90;
		long pp = p; // Implicit TypeCasting
		byte l = (byte)p;  // Explicit Typecasting
		Integer y1 = 90;
		byte y2 = y1.byteValue();  //xxxValue
		System.out.println(Integer.toHexString(999));
		System.out.println(Integer.toOctalString(777));
		LinkedList list = new LinkedList();
		int y = 1000; // Primitive 
		// Boxing - Convert Primitive into Object
		//Integer y1 = new Integer(y); //(Boxing) //y1 is a object
		//list.add(y1);
		list.add(new Integer(2000));
		list.add(3000);
		list.remove(new Integer(2000));
		//list.remove(2000);
		

	}

}
