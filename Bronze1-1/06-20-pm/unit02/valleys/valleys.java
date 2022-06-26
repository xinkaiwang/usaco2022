/*
 * Valleys
 */
import java.util.*;
public class valleys {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		for(int j=0; j<N; j++)
			A[j] = in.nextInt();
		in.close();
		
		int cnt = 0;
		for(int j=1; j<N-1; j++) {
			//no value in a neighborhood is smaller; there is a value larger
			boolean validL = false;
			for(int i=j-1; i>=0; i--) {
				if(A[i]>A[j]) {
					validL = true;
					break;
				}
				else if(A[i]<A[j]) {
					break;
				}
			}

			boolean validR = false;
			for(int i=j+1; i<N; i++) {
				if(A[i]>A[j]) {
					validR = true;
					break;
				}
				else if(A[i]<A[j]) {
					break;
				}
			}

			if(validL && validR)
				cnt++;
		}
		System.out.println(cnt);
	}
}