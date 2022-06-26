import java.util.*;
public class distance {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		//the locations of all the 0s
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int j=1; j<=N; j++) {
			int x = in.nextInt();
			if(x==0)
				A.add(j);
		}
		in.close();
		
		long sum1 = sumdist(A);
		Collections.reverse(A);
		if(!A.isEmpty()) A.remove(A.size()-1);
		long sum2 = sumdist(A);
		System.out.println(sum1 + sum2);
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