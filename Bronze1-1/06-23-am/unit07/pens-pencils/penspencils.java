/*
 * Pens and pencils
 */
import java.util.*;
public class penspencils {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long T = in.nextInt(); //total money
		long x = in.nextInt(); //unit cost for pens
		long y = in.nextInt(); //unit cost for pencils
		in.close();
		
		long ans = 0;
		for(int k=0; k<=T/x; k++) {
			//buying k pens costs k*x; the rest is for pencils:
			//  at most (T-k*x) / y pencils
			ans += (T-k*x)/y + 1;
		}
		System.out.println(ans);
	}
}