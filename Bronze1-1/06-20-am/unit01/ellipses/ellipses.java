/*
 * Ellipses overlap
 */
import java.util.*;
public class ellipses {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a1 = in.nextInt();
		int b1 = in.nextInt();
		int h1 = in.nextInt();
		int k1 = in.nextInt();
		
		int a2 = in.nextInt();
		int b2 = in.nextInt();
		int h2 = in.nextInt();
		int k2 = in.nextInt();
		in.close();

		int count = 0;
		for(int x=h1-a1; x<=h1+a1; x++) {
			for(int y=k1-b1; y<=k1+b1; y++) {
				int p1 = (x-h1)*b1;
				int q1 = (y-k1)*a1;
				if(p1*p1 + q1*q1 < a1*a1*b1*b1) {
					
					int p2 = (x-h2)*b2;
					int q2 = (y-k2)*a2;
					if(p2*p2 + q2*q2 < a2*a2*b2*b2)
						count++;
				}
			}
		}
		System.out.println(count);
	}
}