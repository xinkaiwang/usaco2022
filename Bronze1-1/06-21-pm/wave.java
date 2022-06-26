/*
 * Longest wave
 */
import java.util.*;
public class wave {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //# of integers
		int[] A = new int[N];
		for(int j=0; j<N; j++)
			A[j] = in.nextInt();
		in.close();
		
		ArrayList<Integer> B = new ArrayList<>();
		B.add(Integer.MAX_VALUE);
		
		for(int j=0; j<N; j++) {
			if(B.size()%2==1) {
				if(A[j]<B.get(B.size()-1))
					B.add(A[j]);
				else if(A[j]>B.get(B.size()-1)) {
					B.remove(B.size()-1);
					B.add(A[j]);
				}
			}
			else { //B.size()%2==0
				if(A[j]<B.get(B.size()-1)) {
					B.remove(B.size()-1);
					B.add(A[j]);
				}
				else if(A[j]>B.get(B.size()-1))
					B.add(A[j]);
			}
		}
		System.out.println(B.size()-1);
	}
}