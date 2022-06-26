/*
 * Day of the week
 */
import java.util.*;
public class day {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt(); //month
		int d = in.nextInt(); //day
		in.close();
		
		int days = 0;
		for(int x=1; x<m; x++) {
			if(x==2)
				days += 28;
			else if(x==1 || x==3 || x==5 || x==7 || x==8 || x==10)
				days += 31;
			else 
				days += 30;
		}
		days += d-1;
		
		days %= 7;
		String[] names = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday",
				"Thursday", "Friday"};
		
		System.out.println(names[days]);
	}
}