/*
 * Duplicates
 * 
 * For each value in A, update its frequency. Save the frequencies in an array.
 */
import java.util.*;
public class duplicatesC {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Q = in.nextInt(); //# of queries
		while(Q-->0) { //use value first; then decrease
		
			int N = in.nextInt(); //# of integers
			int K = in.nextInt(); //threshold
			int[] freq = new int[1001];
			for(int j=0; j<N; j++) {
				freq[ in.nextInt() ]++;
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