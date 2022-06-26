/*
 * Find the number of primes in an interval [m, n].
 */
import java.util.*;
public class findprimes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int m = in.nextInt();
		int n = in.nextInt();
		
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);

		//traverse all entries
		for(int k=2; k<=n; k++) {
			if(isPrime[k]) {
				for(int j=k+k; j<=n; j=j+k) {
					if(isPrime[j])
						isPrime[j] = false;
				}
			}
		}

		int count = 0; //# of primes
		for(int k=Math.max(2, m); k<=n; k++) {
			if(isPrime[k]) {
				count++;
			}
		}
		System.out.println(count);
		in.close();
	}
}
