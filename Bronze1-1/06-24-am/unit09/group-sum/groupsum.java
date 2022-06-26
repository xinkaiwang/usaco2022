/*
 * Group sum
 */
import java.io.*;
import java.util.*;
public class groupsum {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int Q = in.nextInt(); //# of queries
		while(Q-->0) {
			int N = in.nextInt();
			int T = in.nextInt();
			
			int[] A = new int[N];
			for(int j=0; j<N; j++)
				A[j] = in.nextInt();
	
			boolean res = sum(A, 0, T);
			System.out.println(res ? "YES" : "NO");
		}
		System.out.println();
		in.close();
	}

	//Report whether to find a subsequence of A (from "start" to the end, 
	// not necessarily continuous) that adds up to sum.
	public static boolean sum(int[] A, int start, int sum) {
		if(sum==0)
			return true;
		
		if(start==A.length-1)
			return A[start]==sum;
		
		return sum(A, start+1, sum) || sum(A, start+1, sum-A[start]);
	}
}
