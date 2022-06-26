/*
 * Minimum average difference
 */
import java.util.*;
public class avgdiff {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		for(int j=0; j<N; j++)
			A[j] = in.nextInt();
		in.close();
		
		int minDiff = Integer.MAX_VALUE; //record of min average difference
		int loc = -1; //first location achieving minDiff
		
		int sum = 0; //total sum of all integers in A
		for(int j=0; j<N; j++)
			sum += A[j];
		
		for(int j=0; j<N; j++) {
			int s1 = 0; //sum on the left half
			for(int i=0; i<=j; i++)
				s1 += A[i];
			
			int avg1 = s1 / (j+1); //average on the left half
			int avg2 = (j<N-1 ? (sum-s1)/(N-1-j) : 0); //average on the right half
			/*
			if(j<N-1)
				avg2 = (sum-s1)/(N-1-j);
			else
				avg2 = 0;
			 */
			
			if(Math.abs(avg1-avg2)<minDiff) {
				minDiff = Math.abs(avg1-avg2);
				loc = j;
			}
		}
		System.out.println(loc);
	}
}