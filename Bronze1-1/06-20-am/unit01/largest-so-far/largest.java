/*
 * Largest so far
 */
import java.util.*;
public class largest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		for(int j=0; j<N; j++)
			A[j] = in.nextInt();

		int count = 0;
		for(int j=0; j<N; j++) {
			boolean isLargest = true;
			for(int i=0; i<j; i++) {
				if(A[i]>=A[j]) { //no integer on the left is >= A[j]
					isLargest = false;
					break;
				}
			}
			if(isLargest)
				count++;
		}
		System.out.println(count);
		
		in.close();
	}
}