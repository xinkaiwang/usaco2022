import java.util.*;
public class fence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt(); //interval 1
		int y1 = in.nextInt(); 
		
		int x2 = in.nextInt(); //interval 2
		int y2 = in.nextInt();
		
		int ans1 = 0, ans2 = 0; //painted once and twice respectively
		if(x1<x2) {
			if(y1<x2) {
				ans1 = y1-x1 + y2-x2;
			}
			else if(y1<y2) 
				ans1 = x2 - x1 + y2 - y1;
			else
				ans1 = x2 - x1 + y1 - y2;
		}
		
		ans2 = ((y2-x2 + y1-x1) - ans1)/2;
		System.out.println(ans1 + "\n" + ans2);
		in.close();
	}
}
