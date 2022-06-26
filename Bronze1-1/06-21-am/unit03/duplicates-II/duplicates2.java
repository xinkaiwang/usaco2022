/*
 * Duplicates II
 */
import java.util.*;
public class duplicates2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //# of integers
		int T = in.nextInt(); //target
		int K = in.nextInt(); //dist between indices
		
		int[] A = new int[N];
		for(int j=0; j<N; j++)
			A[j] = in.nextInt();

		boolean exist = false;
		int ans1 = -1, ans2 = -1;
		Outer:
		for(int i=0; i<N; i++){
            for(int j=i+1; j<N && j-i<=K; j++){
                if(Math.abs(A[i] - A[j]) <= T) {
                	exist = true;
                	ans1 = i+1;
                	ans2 = j+1;
                	break Outer;
                }
            }
        }
		if(exist)
			System.out.println(ans1 + " " + ans2);
		else
			System.out.println(-1);
		
		in.close();
	}
}