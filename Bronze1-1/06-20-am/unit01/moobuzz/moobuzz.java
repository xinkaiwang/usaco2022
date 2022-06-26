/*
 * Moo buzz
 */
import java.util.*;
public class moobuzz {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		
		for(int j=1; j<=N; j++) {
			String ans = "" + j;
			if(j%15==0)
				ans = "Moobuzz";
			else if(j%3==0)
				ans = "Moo";
			else if(j%5==0)
				ans = "Buzz";
			System.out.print(ans + " ");
		}
	}
}