interface HomeDesign
{
	void doorDesign();
	void floorDesign();
	void roofDesign();
	void windowDesign();
	default void gardenDesign(){
		System.out.println("Garden is Only for Large Home");
	}
	default void servantRoom(){
		System.out.println("Servant Room for Large Home and Medium Home...");
	}
	
}
class MediumHomeDesign implements HomeDesign{

	@Override
	public void doorDesign() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void floorDesign() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void roofDesign() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDesign() {
		// TODO Auto-generated method stub
		
	}
	
}
class LargeHomeDesign implements HomeDesign{

	@Override
	public void doorDesign() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void floorDesign() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void roofDesign() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDesign() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gardenDesign() {
		// TODO Auto-generated method stub
		
	}
	
}
class SmallHomeDesign implements HomeDesign
{

	@Override
	public void doorDesign() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void floorDesign() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void roofDesign() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDesign() {
		// TODO Auto-generated method stub
		
	}

	
	
}


interface K1
{
	public default void print(){
		System.out.println("K1 Print...");
	}
}
interface K2
{
	public default void print(){
		System.out.println("K2 Print...");
	}
}
interface K3 extends K1, K2
{
	@Override
	public default void print(){
		K1.super.print();
		K2.super.print();
		
	}
}

public class InterfaceProblem {

	public static void main(String[] args) {
		MediumHomeDesign home = new MediumHomeDesign();
		home.doorDesign();
		// TODO Auto-generated method stub

	}

}
