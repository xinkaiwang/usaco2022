/*
 * Complete tasks
 */
import java.util.*;
public class tasks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] freq = new int[1_000_001];
		for(int j=0; j<N; j++) {
			int x = in.nextInt();
			freq[x]++;
		}
		
		int ans = 0;
		for(int x=0; x<=1_000_000; x++) {
			if(freq[x]==1) {
				ans = -1;
				break;
			}
			else
				ans += (freq[x]+2)/3;  //round up
		}
		System.out.println(ans);
		in.close();
	}
}
