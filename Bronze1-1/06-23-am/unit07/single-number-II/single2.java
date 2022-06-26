/*
 * Single number II
 * 
 * Find the single number that appears only once while all others 
 * appear three times.
 */
import java.util.*;
public class single2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		for(int j=0; j<N; j++)
			A[j] = in.nextInt();
		
	    int ans = 0;
	    for(int k=0; k<32; k++) {
	    	int mask = 1<<k;  //only digit k is 1; 0 at all other digits
	    	int sum = 0;
	    	for(int x : A)
	    		if((x&mask)>0) sum++;
	      
	    	if(sum%3==1) ans = ans|mask;
	    }
		
		System.out.println(ans);
		in.close();
	}
}