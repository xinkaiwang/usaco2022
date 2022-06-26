import java.util.*;
public class dayOfWeek {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt(); //month
		int d = in.nextInt(); //day
		
		//find the day of m/d/2022 assuming 1/1/2022 is Saturday
		int td = 0; //total number of days after 1/1/2022
		for(int j=1; j<m; j++) {
//			if(j==1) td+=31;  //Jan
//			else if(j==2) td+=28; //Feb
//			
//			//..
//			
//			else td+=30;  //Nov

			if(j==2)
				td += 28;
			else if(j==1 || j==3 || j==5 || j==7 || j==8 || j==10)
				td += 31;
			else
				td += 30;
		}
		
		td += d-1;
		
		//display the day as a string "Monday", "Tuesday"...
		String[] week = {"Saturday", "Sunday", "Monday", "Tuesday",
				"Wednesday", "Thursday", "Friday"};
		System.out.println(week[td%7]);
	}
}
