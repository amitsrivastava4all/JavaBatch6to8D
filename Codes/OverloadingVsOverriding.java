/*
 * For Overriding 
 * Rule - 1 there must be inheritance
 * Rule - 2 Overridden method signature must be match with the parent class method
 * What is Signature
 * Signature = return type + method name + arguments
 * It will hide parent class method, and to call parent class method we use super
 * Only instance method can override , instance variable can't
 * instance method are bind with object, and object is on runtime, that's why
 * overriding also called Dynamic Polymorphism or Late Binding or Runtime Polymorphism
 * RULES of Overriding
 * RULE - 1 Weaker Access Rule
 * RULE -2 CoVariant Return type Rule (Java 1.5)
 */
class X
{
	int p,q,r;
	X(){
		p = 100;
		q = 200;
		r = 300;
	}
}
class XChild extends X
{
	int k = 90;
}
class Parent
{
	void show(){
		System.out.println("Parent class Show");
	}
	protected X print(){
		System.out.println("this is parent print ");
		X obj = new X();
		return obj;
	}
}
class Child extends Parent{
	
	void display(){
		System.out.println("Child class display....");
	}
	
	@Override
	public  XChild print(){
		//super.print();
		System.out.println("this is child print");
		XChild obj = new XChild();
		return obj;
	}
}
public class OverloadingVsOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent child = new Child();
		//child.print();
		child.show();
		//child.display();
		//Child child = new Child();
		//XChild xchild = child.print();
		XChild xchild = (XChild)child.print();
		System.out.println(xchild.p+" "+xchild.q+" "+xchild.r+" "+xchild.k);

	}

}
