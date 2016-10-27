interface P
{
	public static final int MAX = 100;
	void show();
}
interface Q
{
	int MAX = 200;
	void show();
}
interface R extends P, Q
{
	
}
class R1 implements R
{
	public void show(){
		System.out.println("R1 Show "+P.MAX+" "+Q.MAX);
	}
}
class PP{
	
}
class R2 extends PP implements P, Q
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceRule {

	public static void main(String[] args) {
		R1 obj = new R1();
		obj.show();
		System.out.println(P.MAX+ " "+Q.MAX);

	}

}
