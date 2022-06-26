/*
 * Cownditioning (Dec 2021)
 */
import java.util.*;
public class cownditioning {
	static int count = 0;
	static int[] D;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //# of cows
		D = new int[N];
		for(int j=0; j<N; j++)
			D[j] = in.nextInt();
		
		for(int j=0; j<N; j++)  //D[j] = final value - initial value
			D[j] = D[j] - in.nextInt();
		in.close();
		
		for(int x=0; x<N; ) {
			if(D[x]==0) { //if difference is already 0
				x++;
				continue;
			}
			
			int y = x+1;
			if(D[x]>0) {
				while(y<N && D[y]>0) //block of positive differences
					y++;
				solve(x, y-1);
			}
			else {
				while(y<N && D[y]<0) //block of negative differences
					y++;
				
				for(int z=x; z<y; z++)
					D[z] = -D[z];
				solve(x, y-1);
			}
			x = y;
		}
		System.out.println(count);
	}

	//D[low...high]>0
	static void solve(int low, int high) {
		int prev = 0;
		for(int z=low; z<=high; z++) {
			if(D[z]>prev) 
				count += D[z] - prev;
			prev = D[z];
		}
	}
}