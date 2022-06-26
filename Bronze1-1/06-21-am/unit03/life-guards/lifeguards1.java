import java.util.*;
import java.io.*;
public class lifeguards1 {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("lifeguards.in"));
		PrintWriter pw = new PrintWriter(new File("lifeguards.out"));
		
		int N = in.nextInt(); //# of guards
		int[][] A = new int[N][2];
		for(int j=0; j<N; j++) {
			A[j][0] = in.nextInt(); //start time
			A[j][1] = in.nextInt(); //end time
		}
		in.close();
		
		int maxCoverage = 0; //max coverage of the pool
		
		for(int j=0; j<N; j++) {
			//assume guard j is removed, find the coverage time.
			//all other guards will contribute to the coverage.
			int coverage = 0;
			
			boolean[] covered = new boolean[1000];
			for(int k=0; k<N; k++) {
				if(k==j) continue;
				
				//mark the unit interval being covered
				for(int x=A[k][0]; x<A[k][1]; x++)
					covered[x] = true;
			}
			
			for(int x=0; x<1000; x++)
				if(covered[x]) coverage++;
			
			if(coverage > maxCoverage) maxCoverage = coverage;
			//maxCoverage = Math.max(maxCoverage, coverage);
		}
		pw.println(maxCoverage);
		pw.close();
	}
}
