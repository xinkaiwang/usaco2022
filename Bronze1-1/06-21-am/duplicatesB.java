/*
 * Duplicates
 * 
 * For each value in A, update its frequency. Save the frequencies in an array.
 */
import java.util.*;
public class duplicatesB {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Q = in.nextInt(); //# of queries
		while(Q-->0) { //use value first; then decrease
		
			int N = in.nextInt(); //# of integers
			int K = in.nextInt(); //threshold
			int[] A = new int[N];
			for(int j=0; j<N; j++)
				A[j] = in.nextInt();

			int[] freq = new int[1001];
			for(int j=0; j<N; j++) {
//				int x = A[j];
//				freq[x]++;  //increase the frequency of x by 1
				freq[ A[j] ]++;
			}
			
			//check if any integer appeared >= K times
			boolean exist = false;
			for(int x=0; x<=1000; x++) {
				if(freq[x]>=K) {
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