/*
 * HPS (Jan 2017)
 * 
 * (Using %3 to compare the gestures and count the wins)
 */
import java.io.*;
import java.util.*;
public class hps {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("hps.in")); 
		PrintWriter out = new PrintWriter(new File("hps.out"));
		
		int N = in.nextInt();
		
		int[][] nums = new int[N][2];
		for(int i=0; i<N; i++) {
			nums[i][0] = in.nextInt();
			nums[i][1] = in.nextInt();
		}
		
		//get the possible higher score by changing the meaning of 1, 2, 3
		int score = getHighScore(nums);
		out.println(score);
		out.close();
		in.close();
	}
	
	public static int getHighScore(int[][] nums) {
		//1 > 2 > 3 > 1
		int count1 = 0;
		for(int i=0; i<nums.length; i++) {
			if((nums[i][0]%3) == nums[i][1]-1)
				count1++;
		}

		//1 > 3 > 2 > 1
		int count2 = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i][0]-1 == (nums[i][1]%3))
				count2++;
		}
	
		return Math.max(count1, count2);
	}
}
