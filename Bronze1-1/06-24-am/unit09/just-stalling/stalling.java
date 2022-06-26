/*
 * Stalling (Jan 2021)
 */
import java.io.*;
import java.util.*;
public class stalling {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //# of cows and stalls
		
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();
		for(int j=0; j<N; j++)
			A.add(in.nextInt());
		
		for(int j=0; j<N; j++)
			B.add(in.nextInt());
		
		Collections.sort(A);
		Collections.sort(B);

		System.out.println(fit(A, B));
		in.close();
	}
	
	//# of ways of putting cows in A to barns in B
	static long fit(ArrayList<Integer>A, ArrayList<Integer>B) {
		int n = A.size();
		if(n==1)
			//return A.get(0)<=B.get(0) ? 1 : 0;
			if(A.get(0)<=B.get(0))
				return 1;
			else
				return 0;

		//All stalls >= A[n-1] are equivalent to A[n-1].
		// A[n-1] has to be in one of these stalls.
		int k=n-1;
		while(k>=0 && B.get(k)>=A.get(n-1)) {
			B.set(k, A.get(n-1));
			k--;
		}

		A.remove(n-1);
		B.remove(n-1);
		
		return fit(A, B) * (n-1-k);
	}
}
