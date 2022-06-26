/*
 * Tournament matches
 */
import java.util.*;
public class tournaments {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		
		System.out.println(solve(N));
	}
	
	public static int solve(int n) {
		if(n<=1)
			return 0;
		else if(n%2==0)
			return n/2 + solve(n/2);
		else
			return (n-1)/2 + solve((n+1)/2);
	}
}