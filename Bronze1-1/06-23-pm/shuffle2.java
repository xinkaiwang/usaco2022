import java.util.*;

public class shuffle2 {
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
		int[] curr = new int[N+1]; //round 3 line up
		for(int i=1; i<=N; i++)
			curr[i] = in.nextInt();
		
		//apply the backward shuffle 3 times
		// curr -> prev
		for(int round=0; round<3; round++) {
			int[] prev = new int[N+1]; //line up at the previous round
			for(int j=1; j<=N; j++) {
				prev[ b[j] ] = curr[j]; //cow curr[j] was at position j will go
									    //  to position b[j] in line up prev
			}
			curr = prev; //no copy-paste of the elements;
						 //pass the address of prev to curr
		}
		
		//print the initial lineup
		for(int j=1; j<=N; j++)
			System.out.println(curr[j]);

		in.close();
	}
}