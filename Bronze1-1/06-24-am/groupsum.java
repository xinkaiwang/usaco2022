import java.util.*;
public class groupsum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //# of integers
		int T = in.nextInt(); //target
		
		ArrayList<Integer> A = new ArrayList<>();
		for(int j=0; j<N; j++)
			A.add(in.nextInt());
		
		System.out.println(solve(A, T));
		in.close();
	}

	public static boolean solve(ArrayList<Integer> A, int T) {
		if(A.isEmpty())
			//return T==0 ? true : false;
			if(T==0)
				return true;
			else
				return false;
			
		int N = A.size();
		for(int j=0; j<N; j++) {
			ArrayList<Integer> B = new ArrayList<>();
			B.addAll(A);
			B.remove(j);
			
			if(solve(B, T-A.get(j)) || solve(B, T)) {
				return true;
			}
		}
		
		return false;
	}
}
