import java.util.*;

public class valleys {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		for(int j=0; j<N; j++)
			A[j] = in.nextInt();
		in.close();
		
		//count # of valleys in A
		int cnt = 0;
		
		for(int j=1; j<N-1; j++) {
			boolean validL = false; //if valid valley to the left
			for(int i=j-1; i>=0; i--) {
				if(A[i]<A[j])
					break;
				else if(A[i]>A[j]) {
					validL = true;
					break;
				}
			}
			
			boolean validR = false; //if valid valley to the right
			for(int i=j+1; i<N; i++) {
				if(A[i]<A[j])
					break;
				else if(A[i]>A[j]) {
					validR = true;
					break;
				}
			}
			
			if(validL && validR) cnt++;
		}
		System.out.println(cnt);
	}
}