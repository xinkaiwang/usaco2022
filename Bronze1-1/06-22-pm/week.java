/*
 * Max work week
 */
import java.util.*;
public class week {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] M = new int[N];
		for(int j=0; j<N; j++)
			M[j] = in.nextInt();
		in.close();
		
		int sum = 0;
		int maxM = 0;
		for(int x : M) {
			sum += x;
			maxM = Math.max(maxM, x);
		}
		
		if(maxM*2<=sum)
			System.out.println(sum);
		else
			System.out.println(2*(sum-maxM)+1);
	}
}