/*
 * Single number I
 * 
 * Find the single number that appears only once while all others 
 * appear twice.
 */
import java.util.*;
public class single1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		int ans = 0;
		for(int j=0; j<N; j++) {
			int x = in.nextInt();
			ans = ans ^ x;
		}
		System.out.println(ans);
		in.close();
	}
}