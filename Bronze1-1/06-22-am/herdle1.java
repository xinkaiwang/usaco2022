import java.util.*;
public class herdle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char[][] ref = new char[3][3]; //reference grid
		for(int r=0; r<3; r++) {
			ref[r] = in.next().toCharArray();
		}
		
		char[][] guess = new char[3][3]; //guess grid
		for(int r=0; r<3; r++)
			guess[r] = in.next().toCharArray();

		in.close();
		
		//count the correct letters in the right positions
		int count1 = 0; //green
		
		

		//count the correct letters in the wrong positions
		int count2 = 0; //yellow

		
		
		System.out.println(count1 + "\n" + count2);
	}
}