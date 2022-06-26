/*
 * Taming (Feb 2018)
 */
import java.io.*;
import java.util.*;
public class taming {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("taming.in"));
		PrintWriter out = new PrintWriter(new File("taming.out"));
		
		int N=in.nextInt();   //number of days
		int[] A=new int[N];   //the records
		for(int k=0; k<N; k++)
			A[k]=in.nextInt();

		boolean consistent = true;
		A[0] = 0;  //mark day 0 as accident day
		for(int j=N-2; j>=0; j--) {
			if(A[j+1]>0) { //if next day value v>0, then today's value is v-1
				if(A[j]==-1)
					A[j] = A[j+1]-1;
				
				else if(A[j]!=A[j+1]-1) {
					consistent = false;
					break;
				}
			}
		}
		
		if(consistent) {
			int min = 0; //minimum number of days with accident
			for(int j=0; j<N; j++)
				if(A[j]==0)
					min++;
			
			int max = min; //maximum number of days with accident
			for(int j=0; j<N; j++)
				if(A[j]==-1)
					max++;
			
			out.println(min + " " + max);
		}
		else 
			out.println(-1);
		out.close();
		in.close();
	}
}
