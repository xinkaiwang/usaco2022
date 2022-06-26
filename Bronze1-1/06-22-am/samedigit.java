import java.util.*;

public class samedigit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next(); //input string
		in.close();
		
		char[] A = str.toCharArray();
		
		int maxL = 0; //max length of any good substring
		int loc = -1; //location of the max good substring
		for(int j=0; j<A.length; ) {
			//check the current block starting from position j
			//Find the last location of the current block
			// or the first location right after the end of current block
			int k = j+1;
			while(k<A.length && A[k]==A[j])
				k++;
			//after the while-loop, k points to the first location of the next block
			//The current block is A[j ... k-1]
			
			if(k-1-j+1>maxL) {
				maxL = k-j;
				loc = j;
			}
			else if(k-j==maxL && A[j]>A[loc]) {
				loc = j;
			}
			
			j = k;
		}
		if(maxL>=3)
			System.out.println(str.substring(loc, loc+maxL));
		else
			System.out.println("None");
	}
}