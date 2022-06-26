import java.util.*;
public class triangles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //# of points P (in Quadrant I)
		int M = in.nextInt(); //# of points Q (on x-axis)
		
		int[][] P = new int[N][2];
		for(int i=0; i<N; i++) {
			P[i][0] = in.nextInt(); //x-coord
			P[i][1] = in.nextInt(); //y-coord
		}
		
		int[] Q = new int[M];
		for(int j=0; j<M; j++) {
			Q[j] = in.nextInt(); //x-coord
		}
		
		int cnt = 0; //# of right triangles that can be formed P[i]Q[j]Q[k]
				
		System.out.println(cnt);
	}
}
