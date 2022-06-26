import java.util.*;
public class findPrimes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt(); //lower bound
		int n2 = in.nextInt(); //upper bound
		in.close();
		
		//count the number of prime integers
		boolean[] isPrime = new boolean[n2+1];
		Arrays.fill(isPrime, true);
		
		//isPrime[x] == true iff x is a prime
		for(int x=2; x<=n2; x++) {
			if(isPrime[x]) {
				//mark all the proper multiples of x as non-prime
				for(int y=x+x; y<=n2; y+=x)
					isPrime[y] = false;
			}
		}
		
		int cnt = 0;
		for(int x=Math.max(2, n1); x<=n2; x++) {
			if(isPrime[x]) cnt++;
		}
		System.out.println(cnt);
		
		ArrayList<Integer> allPrimes = new ArrayList<>();
		for(int x=Math.max(2, n1); x<=n2; x++) {
			if(isPrime[x]) allPrimes.add(x);
		}
	}
}
