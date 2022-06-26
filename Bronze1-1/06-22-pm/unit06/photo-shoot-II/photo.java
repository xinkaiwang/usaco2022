/*
 * Photo shoot II (Feb 2022)
 */
import java.util.*;
public class photo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //# integers

		int[] A = new int[N+1];
		for(int j=1; j<=N; j++)
			A[j] = in.nextInt();

		int[] B = new int[N+1];
		int[] BI = new int[N+1]; //inverse of B
		for(int j=1; j<=N; j++) { //new ID of the cows
			B[j] = in.nextInt();
			BI[B[j]] = j;
		}

		int[] AI = new int[N+1]; //inverse of A
		for(int j=1; j<=N; j++)
			AI[j] = BI[A[j]];

		int maxPref = AI[1]; //max prefix
		int count = 0;
		for(int j = 2; j<=N; j++) {
			if(AI[j] < maxPref)
				count++;
			maxPref = Math.max(maxPref, AI[j]);
		}

		System.out.println(count);
		in.close();
	}
}