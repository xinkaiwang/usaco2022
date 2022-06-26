/*
 * Increasing triple
 */
import java.util.*;
public class triple {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Q = in.nextInt(); //# of queries
		while(Q-->0) {
			int N = in.nextInt(); //# of integers
			int[] A = new int[N];
			for(int j=0; j<N; j++)
				A[j] = in.nextInt();
			
			int min1 = Integer.MAX_VALUE; //the smallest
			int min2 = Integer.MAX_VALUE; //the 2nd smallest
			//min2 is right after min1, if it is not INT_MAX.
			
			boolean ans = false;
			for(int j=0; j<N; j++) {
				if(A[j] <= min1) 
					min1 = A[j];
				else if(A[j] <= min2)
					min2 = A[j];
				else {
					ans = true;
					break;
				}
			}
			System.out.println(ans ? "YES" : "NO");
		}
		in.close();
	}
}