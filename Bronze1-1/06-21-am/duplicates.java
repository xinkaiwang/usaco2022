/*
 * Duplicates
 * (brute force method: )
 */
import java.util.*;
public class duplicates {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Q = in.nextInt(); //# of queries
		while(Q-->0) { //use value first; then decrease
		
			int N = in.nextInt(); //# of integers
			int K = in.nextInt(); //threshold
			int[] A = new int[N];
			for(int j=0; j<N; j++)
				A[j] = in.nextInt();
			
			//check if any integer appeared >= K times
			boolean exist = false;
			for(int j=0; j<N; j++) {
				int freq = 0;
				for(int i=0; i<=j; i++)
					if(A[i]==A[j]) freq++;
				if(freq==K) {
					exist = true;
					break;
				}
			}
			
			if(exist)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
		in.close();
	}
}