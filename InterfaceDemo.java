/*
 * Interface - What to do (ProtoType/Design/Standard)
 * Class - How to do
 */
/*
 * Interface is 100% Abstract
 * All methods are abstract and public by default
 * It has only constants
 */

interface StarPlayer{
	void superPowers();
}

interface IPlayer{
	int HIGH_JUMP = 100;
	int DEFAULT_JUMP= 20;
	int MIN_JUMP = 1;
	void jump();
	void run();
}
class YellowPlayer implements IPlayer, StarPlayer{

	@Override
	public void superPowers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
class RedPlayer implements IPlayer,StarPlayer{
	public void superPowers(){
		System.out.println("Super Power for 3 mins");
	}
	public void jump(){
		System.out.println("RedPlayer Jump "+DEFAULT_JUMP);
	}
	public void run(){
		System.out.println("RedPlayer Run....");
	}
}
class WhitePlayer implements IPlayer{
	public void jump(){
		System.out.println("WhitePlayer Jump "+MIN_JUMP);
	}
	public void run(){
		System.out.println("WhitePlayer Run Fast....");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPlayer iplayer = new RedPlayer();
		StarPlayer star = (StarPlayer)iplayer;
		iplayer.jump();
		iplayer.run();
		star.superPowers();
				

	}

}
