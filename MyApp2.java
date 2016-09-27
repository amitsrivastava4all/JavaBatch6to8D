
public class MyApp2 {

	public static void main(String[] args) {
		
		
		int maxRow = 21;
		int value='A'+(maxRow/2);
		int half = maxRow/2;
		int spaces = 0;
		for(int row = 1; row<=maxRow ; row++){
			value=('A'+half)-spaces;
			for(int space=1; space<=half-spaces; space++){
				System.out.print(" ");
			}
			for(int col = 1; col<=(row<=half?row:spaces+1); col++,value++){
				System.out.print((char)value);
			}
			
			if((half)==spaces){
				spaces = half;
			}
			
			if(row>=(half+1)){
				spaces--;
			}
			else
			{
				spaces++;
			}
			
			System.out.println();
		}

	}

}
