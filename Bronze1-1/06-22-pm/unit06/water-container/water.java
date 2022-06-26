/*
 * Water container
 */
import java.util.*;
public class water {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //# of vertical lines
		int[] H = new int[N];
		for(int j=0; j<N; j++)
			H[j] = in.nextInt();
		in.close();
		
		int maxW = 0;
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				//the water height is determined by the min of H[i] and H[j]
				int y = Math.min(H[i], H[j]);
				maxW = Math.max(maxW, y*(j-i));
			}
		}
		System.out.println(maxW);
	}
}