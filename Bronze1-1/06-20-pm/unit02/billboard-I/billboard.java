/*
 * Billboard (Dec 2017) 
 * An efficient implementation.
 */
import java.util.*;
import java.io.*;
public class billboard {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("billboard.in"));
		PrintWriter out = new PrintWriter(new File("billboard.out"));
		
		int x1 = in.nextInt();  //billboard 1
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		
		int x3 = in.nextInt();  //billboard 2
		int y3 = in.nextInt();
		int x4 = in.nextInt();
		int y4 = in.nextInt();
		
		int x5 = in.nextInt();  //truck
		int y5 = in.nextInt();
		int x6 = in.nextInt();
		int y6 = in.nextInt();
	
		//find the area of overlap between two billboards with the truck
		int overlap1 = Math.max(Math.min(x2, x6)-Math.max(x1, x5), 0) *
				Math.max(Math.min(y2, y6)-Math.max(y1, y5), 0);
		
		int overlap2 = Math.max(Math.min(x4, x6)-Math.max(x3, x5), 0) *
				Math.max(Math.min(y4, y6)-Math.max(y3, y5), 0);
		
		int area1 = (x2-x1) * (y2-y1);
		int area2 = (x4-x3) * (y4-y3);

		out.println( area1 + area2 - overlap1 - overlap2 );
		out.close();
		in.close();
	}
}
