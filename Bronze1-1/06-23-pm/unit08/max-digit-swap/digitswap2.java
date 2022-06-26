/*
 * Max after digit swap
 */
import java.util.*;
public class digitswap2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		String str = in.next();
		int n = str.length();
		
		char[] A = str.toCharArray();
		char[] res = str.toCharArray();
		
		for(int i=0; i<n; i++) {
	        for (int j = i+1; j<n; j++) {
	            char ch = A[i]; A[i] = A[j]; A[j] = ch;

	            if(bigger(A, res))
	            	res = Arrays.copyOf(A, n);
	            
	            ch = A[i]; A[i] = A[j]; A[j] = ch;
	        }
	    }
		for(char ch : res)
			System.out.print(ch);
		System.out.println();
		in.close();
	}
	
	public static boolean bigger(char[] A, char[] B) {
		for(int j=0; j<A.length; j++) {
			if(A[j]<B[j]) return false;
			else if(A[j]>B[j]) return true;
		}
		return false; //equal
	}
}
