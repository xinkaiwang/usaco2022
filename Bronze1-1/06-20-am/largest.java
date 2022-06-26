import java.util.*;
public class largest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //# of integers
		int[] A = new int[N];
		for(int j=0; j<N; j++) {
			A[j] = in.nextInt();
		}
		in.close();
		
		//count the number of integers that are larger than any element
		//  to the left
		int count = 0;
		
		for(int j=0; j<N; j++) {
			boolean isLarger = true;
			for(int i=0; i<j; i++) {
				if(A[i]>=A[j]) {
					isLarger = false;
					break;
				}
			}
			if(isLarger)
				count++;
		}
		System.out.println(count);
	}
}
