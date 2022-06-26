/*
 * Paint fence
 */
import java.util.*;
public class fence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		in.close();
		
		int whole = 0;
		int twice = 0;
		if(a<c) {
			if(b<c) {
				whole = b-a + d-c;
				twice = 0;
			}
			else if(b<d) {
				whole = d-a;
				twice = b-c;
			}
			else { //b>=d
				whole = b-a;
				twice = d-c;
			}
		}
		else if(a<d) {
			if(b<d) {
				whole = d-c;
				twice = b-a;
			}
			else { //b>=d
				whole = b-c;
				twice = d-a;
			}
		}
		else { //a>=d
			whole = b-a + d-c;
			twice = 0;
		}
		
		System.out.println(whole-twice + " " + twice);
	}
}
