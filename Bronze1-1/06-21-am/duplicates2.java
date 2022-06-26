/*
 * Duplicates (with restriction on locations and values)
 */
import java.util.*;
public class duplicates2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //# of integers
		int T = in.nextInt(); //max diff between values
		int K = in.nextInt(); //max diff between locations
		int[] A = new int[N];
		
		for(int j=0; j<N; j++)
			A[j] = in.nextInt();
		in.close();
		
		boolean exist = false;
		Outer:
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N && j<=i+K; j++) {
				if(Math.abs(A[i]-A[j])<=T) {
					exist = true;
					System.out.println((i+1) + " " + (j+1));
					break Outer;
				}
			}
		}
		
		if(!exist)
			System.out.println(-1);
	}
}