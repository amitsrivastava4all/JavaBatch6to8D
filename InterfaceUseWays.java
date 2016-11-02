// SAM Interface
// Single Abstract method interface
@FunctionalInterface
interface Calculate
{
	public int calc(int x, int y);
}
//1st way (Classical Way)  (Define a Class and Implement a Interface
class Adder implements Calculate{
	@Override
	public int calc(int x, int y){
		return x + y;
	}
}
class Test
{
	public void print(Calculate d ){
		int output = d.calc(1000, 200);
		System.out.println("D is "+output);
	}
}
interface PInterface
{
	void print(int x, int y);
}
public class InterfaceUseWays {

	public static void main(String[] args) {
		int y1 = 9999;
		y1++;
			Adder adder = new Adder();
			int result = adder.calc(100, 200);
			System.out.println("Result is "+result);
			// 2nd Way Anonymous Class
			// a) Object creation , class creation , interface implementation and method override
			if(10>2){
			Calculate c = new Calculate(){
				@Override
				public int calc(int x, int y){
					this.print();
					System.out.println("X - Y "+(x-y));
					return x - y;
				}
				public void print(){
					System.out.println("Print Call..");
				}
			};
			result = c.calc(1000, 500);
			System.out.println("(Anonymous class )Result is "+result);
			Test test = new Test();
			test.print(c);
			// 3rd Way Lambda 
			Calculate r = (x,y)->{
				System.out.println("this is lambda expression demo...");
				return x+y;
			};
			System.out.println("Lambda "+r.calc(9090, 89898));
			PInterface p = (a,b)->{
				int dd = a + b;
				System.out.println("P Print Call "+dd);
			};
			p.print(10,20);
			
			
			}
	}

}
