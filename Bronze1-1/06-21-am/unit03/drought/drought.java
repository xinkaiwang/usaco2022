/*
 * Drought (Jan 2022)
 */
import java.util.*;
public class drought {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for(int t=0; t<T; t++) {
			int N = in.nextInt();
			long[] H = new long[N];
			for(int j=0; j<N; j++)
				H[j] = in.nextLong();
			
			long ans = sweepR(H); //sweep left to right
			if(isLevel(H))
				System.out.println(ans);
			
			else { //not level yet
				ans += sweepL(H); //sweep right to left
				if(isLevel(H))
					System.out.println(ans);
				else
					System.out.println(-1);
			}
		}
		
		in.close();
	}

	static long sweepR(long[] H) {
		int N = H.length;
		long sum = 0;
		for(int j=1; j<N-1; j++) {
			if(H[j]>H[j-1]) { //bring down H[j] down to H[j-1]
				long d = H[j] - H[j-1];
				sum += d;
				H[j] -= d;
				H[j+1] -= d;
			}
		}
		
		return sum*2;
	}
	
	static long sweepL(long[] H) {
		int N = H.length;
		long sum = 0;
		for(int j=N-2; j>0; j--) {
			if(H[j]>H[j+1]) { //bring down H[j] down to H[j+1]
				long d = H[j] - H[j+1];
				sum += d;
				H[j] -= d;
				H[j-1] -= d;
			}
		}
		
		return sum*2;
	}
	
	static boolean isLevel(long[] H) {
		boolean flag = (H[0]>=0);
		if(!flag) return false;
		
		for(int j=1; j<H.length; j++) 
			if(H[j]!=H[j-1]) {
				flag = false;
				break;
			}
		return flag;
	}
}