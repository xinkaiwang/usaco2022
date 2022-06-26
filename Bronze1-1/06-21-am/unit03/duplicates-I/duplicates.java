/*
 * Duplicates
 */
import java.util.*;
public class duplicates {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Q = in.nextInt(); //# of queries
		while(Q-->0) {
			int N = in.nextInt();
			int K = in.nextInt();
			
			int[] A = new int[N];
			for(int j=0; j<N; j++)
				A[j] = in.nextInt();
			
			int[] freq = new int[1001];
			for(int j=0; j<N; j++)
				freq[ A[j] ]++;
			
			boolean exist = false;
			for(int x=0; x<=1000; x++) {
				if(freq[x]>=K) {
					exist = true;
					break;
				}
			}
			System.out.println(exist ? "YES" : "NO");
		}
		in.close();
	}
}