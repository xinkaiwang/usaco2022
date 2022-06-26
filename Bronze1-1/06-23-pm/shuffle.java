import java.util.*;

public class shuffle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //# of cows
		int[] a = new int[N+1];  //forward shuffle
		for(int i=1; i<=N; i++) {
			a[i] = in.nextInt();  //i -> a[i]
		}
		
		int[] b = new int[N+1]; //backward shuffle
		for(int i=1; i<=N; i++) {  //a[i] -> i
			b[ a[i] ] = i;
		}
		
		//final line
		int[] L3 = new int[N+1]; //round 3 line up
		for(int i=1; i<=N; i++)
			L3[i] = in.nextInt();
		
		//apply the backward shuffle 3 times
		// L3 -> L2
		int[] L2 = new int[N+1]; //round 2 line up
		for(int j=1; j<=N; j++) {
			L2[ b[j] ] = L3[j];  //cow L3[j] was at position j will go
								//  to position b[j] in line up L2
		}
		
		int[] L1 = new int[N+1]; //round 1 line up
		for(int j=1; j<=N; j++) {
			L1[ b[j] ] = L2[j];  //cow L2[j] was at position j will go
								//  to position b[j] in line up L1
		}
		
		int[] L0 = new int[N+1]; //initial line up
		for(int j=1; j<=N; j++) {
			L0[ b[j] ] = L1[j];  //cow L1[j] was at position j will go
								//  to position b[j] in line up L0
		}
		//print the initial lineup
		for(int j=1; j<=N; j++)
			System.out.println(L0[j]);
		in.close();
	}
}