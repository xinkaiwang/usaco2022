/*
 * Longest divisible subsequence
 */
import java.util.*;
public class divsubseq {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //# of integers
		int[] A = new int[N];
		for(int j=0; j<N; j++)
			A[j] = in.nextInt();
		in.close();
		
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		for(int j=0; j<N; j++) {
			lists.add(new ArrayList<>());
			lists.get(j).add(A[j]);
		}
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				if(A[j]%A[i]==0 && lists.get(j).size() <= lists.get(i).size()) {
					lists.get(j).clear();
					lists.get(j).addAll(lists.get(i));
					lists.get(j).add(A[j]);
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