import java.util.*;

public class triangles2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //# of points in Quadrant I
		int M = in.nextInt(); //# of points on x-axis
		
		int[][] A = new int[N][2];
		for(int i=0; i<N; i++) {
			A[i][0] = in.nextInt();
			A[i][1] = in.nextInt();
		}
		
		int[] B = new int[M];
		for(int j=0; j<M; j++)
			B[j] = in.nextInt();
		
		int cnt = 0;  //# of possible right triangles
		for(int j=0; j<M-1; j++) {
			for(int k=j+1; k<M; k++) {
				for(int i=0; i<N; i++) {
					int a2 = (A[i][0]-B[j])*(A[i][0]-B[j])+A[i][1]*A[i][1];
					int b2 = (A[i][0]-B[k])*(A[i][0]-B[k])+A[i][1]*A[i][1];
					int c2 = (B[j]-B[k])*(B[j]-B[k]);
					if(a2+b2==c2 || a2+c2==b2 || b2+c2==a2)
						cnt++;
				}
			}
		}

		System.out.println(cnt);
		
		in.close();
	}
}