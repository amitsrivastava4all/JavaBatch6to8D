/*
 * Prevent Object Creation of Most Generic class
 * Enforce child to must overide the abstract methods
 * abstract class may or may not have abstract methods
 * if single method is abstract so class must be abstract
 */

// this class can't be inherit
final class T
{
	
}
//class T2 extends T
//{
//	
//}
class T3
{
	final void print(){
		System.out.println("U can't overide me...");
	}
}
final class T4 extends T3
{
	//final double PI = 3.14; // Member Variable
	final double PI;
	
	T4(){
		PI=3.14;
	}
	
//	void takeInput(){
//		PI = 3.14;
//	}

	void show(){
		final String p2 ;
		int x = 10;
		//p2="hello";
		if(x>2){
			p2 = "Hello"; 
		}
		else
		{
			p2 = "Ok";
		}
		System.out.println("P2 "+p2);
		//final String p = "I am a Local Variable";
		//p="Hello";
	}
	
//	void print(){
//		System.out.println("Print..."); 
//		
//	}
}

// S O L I D
// O = Open Close Principle
// A Class is Open for Extension and Close for Modification

abstract class Account
{
	double balance;
	int accountNo;
	String name;
	void desposit(){
		System.out.println("Account class Deposit Call... ");
	}
	Account(){
		System.out.println("this is account class cons...");
	}
	abstract void roi();
}
class SavingAccount extends Account
{
	SavingAccount(){
		//super();
		System.out.println("this is saving account cons...");
	}
	@Override
	void roi(){
		System.out.println("SavingAccount ROI");
	}
}
class CurrentAccount extends Account
{
	@Override
	void roi(){
		System.out.println("CurrentAccount ROI");
	}
}

class P1 {
	 final private void print(){
		System.out.println("P1 Print...");
	}
}
class P2 extends P1{
	//@Override
	void print(){
		System.out.println("p2 print...");
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int P = 10;
		//P = 20;
		final SavingAccount sa = new SavingAccount();
		sa.accountNo= 1000;
		sa.balance=999;
		sa.balance++;
		//sa = new SavingAccount();
		//Account sa = new Account();
		
	}

}
