/*
 * Why we Do Overriding?
 * 
 */

class P1 //extends Object
{
	int x = 1000;
	void print(){
		System.out.println("P1 Print Call...");
	}
}
class P2 extends P1{
	int x = 2000;
	@Override
	void print(){
		System.out.println("P2 Print Call...");
	}
}
class P3 extends P2{
	int x = 3000;
	@Override
	void print(){
		System.out.println("P3 Print Call... "+(((P1)this).x+super.x+this.x));
	}
}

class P
{
	int x = 1000;
	void show(){
		System.out.println("P Show "+this.x);
	}
	void show(int x, int y){
		System.out.println(" I am Also Overloading with 2 Arguments....");
	}
}
class R extends P
{
	int x = 2000;
	@Override
	void show(){
		System.out.println("R Show "+this.x);
	}
	void disp(){
		System.out.println("R Disp");
	}
	void show(int x){
		System.out.println("I am Overloading...");
	}
}
public class OverridingRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		R obj = new R();
//		//R obj = new R();
//		obj.show();
//		obj.show(1000);
//		obj.show(1000,2000);
//		System.out.println(obj.x);
		
		P1 obj = new P3();
		//System.out.println(obj.x);
		obj.print();
	
		//obj.disp();

	}

}
