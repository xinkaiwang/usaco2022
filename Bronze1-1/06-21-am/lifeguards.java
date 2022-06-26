import java.util.*;
import java.io.*;
public class lifeguards {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("lifeguards.in"));
		PrintWriter out = new PrintWriter(new File("lifeguards.out"));
		int N = in.nextInt();
		int[][] A = new int[N][2];
		for(int j=0; j<N; j++) {
			A[j][0] = in.nextInt(); //start time
			A[j][1] = in.nextInt(); //end time
		}
		in.close();
		
		int maxCoverage = 0; //max coverage if one guard is removed

		for(int j=0; j<N; j++) { //assume guard j is removed
			//find the coverage of the other N-1 guards
			int coverage = 0;
			
			    //break the interval [0, 100] to 100 unit intervals
			
			

			maxCoverage = Math.max(maxCoverage, coverage);
		}
		out.println(maxCoverage);
		out.close();
		in.close();
	}
}
