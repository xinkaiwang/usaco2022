/*
 * Cow jog (Dec 2014)
 */
import java.io.*;
import java.util.*;
public class cowjog {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("cowjog.in"));
		PrintWriter out = new PrintWriter(new File("cowjog.out"));
		
		int N = in.nextInt();  // # of cows
		
		int[] pos = new int[N];
		int[] speed = new int[N];
		
		for(int k=0; k<N; k++) {
			pos[k] = in.nextInt();
			speed[k] = in.nextInt();
		}

		//Update position and speed to count the groups:  
		//  If speed[k] > speed[k+1], then pos[k] should be pos[k+1]-1   
		//  and speed[k] should be speed[k+1].

		int count = 1;
		for(int k=N-2; k>=0; k--) {
			if(speed[k]>speed[k+1]) { //the two cows will be in one group
				pos[k] = pos[k+1]-1;
				speed[k] = speed[k+1];  
			}
			else if(speed[k]<speed[k+1]) { //the two cows won't be in one group
				count++;
			}
			else if(pos[k]<pos[k+1])  //the two cows won't be in one group
				count++;
		}		

		out.println(count);
		out.close();
		in.close();
	}
}
