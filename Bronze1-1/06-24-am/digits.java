/*
 * Recursively find the product of non-zero digits until the product is < 10.
 */
import java.util.*;
public class digits {

	//return the product of non-zero digits of n
	public static int f(int n) {
		if(n<10)
			return n;
		else {
			int p = 1; //to store the product of non-zero digits of n
			while(n>0) {
				if(n%10!=0) //check the last digit of n
					p = p * (n%10);
				n /= 10;  //drop the last digit
			}
			
			//System.out.println(p);
			return f(p);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
		System.out.println(f(n));
	}
}
