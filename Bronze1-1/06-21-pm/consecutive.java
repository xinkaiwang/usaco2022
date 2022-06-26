/*
 * Remove consecutive subarrays
 */
import java.util.*;
public class consecutive {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //# of integers
		int K = in.nextInt();
		int[] A = new int[N];
		for(int j=0; j<N; j++)
			A[j] = in.nextInt();
		in.close();
		
		ArrayList<Integer> B = new ArrayList<>();
		for(int j=0; j<N; j++) {
			if(B.isEmpty() || A[j]==1+B.get(B.size()-1)) {
				B.add(A[j]);
				continue;
			}
			else { //A[j] is not consecutive to B[last]
				
				//check the consecutive subarray seen so far
				int i = B.size()-2;
				while(i>=0) {
					if(B.get(i)+1!=B.get(i+1))
						break;
					i--;
				}
				if(i<B.size()-K) { 
					//a consecutive subarray with length >= K exists; remove it
					for(int x=B.size()-1; x>i; x--)
						B.remove(B.size()-1);
				}

				B.add(A[j]);
			}
		}
		for(int v : B)
			System.out.print(v + " ");
		System.out.println();
	}
}