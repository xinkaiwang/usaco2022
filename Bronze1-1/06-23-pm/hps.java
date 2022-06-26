import java.util.*;
import java.io.*;
public class hps {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("hps.in"));
		PrintWriter out = new PrintWriter(new File("hps.out"));
		
		int N = in.nextInt(); //# of rounds
		int[][] play = new int[N][2];
		for(int j=0; j<N; j++) {
			play[j][0] = in.nextInt();  //player 0
			play[j][1] = in.nextInt();  //player 1
		}
		in.close();
		
		int maxWins = 0;
		
		//under the assumption 1 > 2 > 3 > 1
		
		
		
		//under the assumption 2 > 1 > 3 > 2
		
		
		
		System.out.println(maxWins);
		in.close();
		out.close();
	}
}