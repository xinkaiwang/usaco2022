/*
 * Bakc and forth distance II
 */
import java.util.*;
public class distance2 {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		for(int j=0; j<=100000; j++)
			A.add(new ArrayList<Integer>());
		
		for(int j=0; j<N; j++) {
			int x = in.nextInt();
			A.get(x).add(j);
		}
		in.close();

		//find the min total distance finishing any one flavor
		long minDist = Long.MAX_VALUE;
		for(ArrayList<Integer> L : A) {
			if(L.isEmpty() || L.size()<2) continue;
			long sum1 = sumdist(L);
			Collections.reverse(L);
			L.remove(L.size()-1);
			long sum2 = sumdist(L);
			minDist = Math.min(sum1+sum2, minDist);
		}
		System.out.println(minDist);
	}
	
	static long sumdist(ArrayList<Integer> A) {
		long sum = 0;
		int len = A.size();
		for(int j=0; j<A.size()/2; j++) {
			sum += Math.abs(A.get(len-1-j) - A.get(j));
		}
		return sum;
	}
}