/*
 * find the probability of picking three cards, where each card shares a 
 * letter or an integer with at least one of the other cards.
 * Each card has a letter and an integer.
 */
import java.util.*;
import java.io.*;
public class cards {
	static char[] letters;
	static int[] nums;
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();   //# of cards

		letters = new char[N];
		nums = new int[N];
		for(int j=0; j<N; j++) {
			String s = in.next();
			letters[j] = s.charAt(0);
			nums[j] = Integer.parseInt(s.substring(1));
		}
		in.close();
		
		int count = 0;   //# of ways for picking 3 such cards
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				for(int k=j+1; k<N; k++) {
					if((share(i, j) || share(i, k)) &&
					   (share(j, i) || share(j, k)) &&
					   (share(k, i) || share(k, j)))
 						 count++;
				}
			}
		}

		int total = N * (N-1) * (N-2) / 6;  //total # of 3-card combination
		int g = gcf(count, total);
		
		System.out.println(count/g + " " + total/g);
	}
	
	static boolean share(int i, int j) {
		return letters[i]==letters[j] || nums[i]==nums[j];
	}

	//find the greatest common factor of two integers
	static int gcf(int a, int b) {
		if(a==0 || b==0) return a+b;
		return gcf(b, a%b);
	}
}
