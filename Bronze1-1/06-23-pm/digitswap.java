import java.util.*;

public class digitswap {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();  //input string (a very long integer)
		in.close();
		
		//maxV: the max value possible after swapping at most once
		int n = str.length();
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				//if after swapping positions i and j, the value is bigger than maxV, 
				// update maxV
				
				
			}
		}
		
		//print maxV
		System.out.println();
	}
}