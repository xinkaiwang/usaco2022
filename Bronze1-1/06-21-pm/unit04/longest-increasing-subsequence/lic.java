/*
 * Longest increasing subsequence
 */
import java.util.*;
public class lic {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //# of integers
		int[] A = new int[N];
		for(int j=0; j<N; j++)
			A[j] = in.nextInt();
		in.close();
		
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		for(int j=0; j<N; j++) {
			lists.add(new ArrayList<Integer>());
			lists.get(j).add(A[j]);
		}		

		for(int i=1; i<N; i++) {
			for(int j=0; j<i; j++) {
				if(A[j]<A[i] && lists.get(j).size()>=lists.get(i).size()) {
					lists.get(i).clear();
					lists.get(i).addAll(lists.get(j));
					lists.get(i).add(A[i]);
				}
			}
		}
		
		int maxL = 1;
		int id = 0;
		for(int j=0; j<N; j++) {
			if(lists.get(j).size()>maxL) {
				maxL = lists.get(j).size();
				id = j;
			}
		}
		
		System.out.println(maxL);
		for(int v : lists.get(id))
			System.out.print(v + " ");
		System.out.println();
	}
}