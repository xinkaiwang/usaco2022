/*
 * Complete tasks
 */
import java.util.*;
public class tasks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //# of integers
		int[] A = new int[N];
		for(int j=0; j<N; j++)
			A[j] = in.nextInt();
		in.close();
		
		//create a frequency array to store the frequency of each x in A
		int[] freq = new int[1_000_001];
		for(int j=0; j<N; j++)
			freq[ A[j] ]++;
		
		//check the frequency for each x in [0, 1e6]
		// add the contribution to the total count
		int cnt = 0;
		for(int x=0; x<=1_000_000; x++) {
			if(freq[x]==-1) {
				cnt = -1;
				break;
			}
			else if(freq[x]%3==0)
				cnt += freq[x]/3;
			else 
				cnt += freq[x]/3 + 1;
		}
		System.out.println(cnt);
	}
}