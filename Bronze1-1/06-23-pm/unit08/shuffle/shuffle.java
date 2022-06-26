/*
 * Bovine shuffle (Dec 2017)
 */
import java.util.*;
import java.io.*;
public class shuffle {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("shuffle.in"));
		PrintWriter out = new PrintWriter(new File("shuffle.out"));
		
		int N = in.nextInt(); //# of positions
		int[] A = new int[N+1]; //forward shuffle
		for(int x=1; x<=N; x++)
			A[x] = in.nextInt();   //x -> A[x]

		//inverse shuffle: y -> B[y] (or A[x] -> x)
		int[] B = new int[N+1];
		for(int x=1; x<=N; x++)
			B[A[x]] = x;  //y -> B[y]
		
		//current line up
		int[] curr = new int[N+1];
		for(int j=1; j<=N; j++)
			curr[j] = in.nextInt();
		
		for(int round=0; round<3; round++) {
			int[] prev = new int[N+1]; //previous line up
			
			for(int y=1; y<=N; y++) {
				prev[B[y]] = curr[y];  //y -> B[y]
			}
			curr = prev;
		}
		for(int x=1; x<=N; x++)
			out.println(curr[x]);
		out.close();
	}
}
