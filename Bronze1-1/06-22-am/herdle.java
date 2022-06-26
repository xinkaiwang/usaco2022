/*
 * Herdle (Jan 2022)
 */
import java.util.*;
public class herdle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char[][] ref = new char[3][3]; //reference grid
		for(int r=0; r<3; r++)
			ref[r] = in.next().toCharArray();
		
		char[][] guess = new char[3][3]; //guess grid
		for(int r=0; r<3; r++)
			guess[r] = in.next().toCharArray();

		int green = 0;
		int[] freq1 = new int[26]; //frequency in reference grid
		int[] freq2 = new int[26]; //frequency in guess grid
		for(int r=0; r<3; r++) {
			for(int c=0; c<3; c++) {
				if(ref[r][c]==guess[r][c]) //letters in right locations
					green++;
				else { //letters in wrong locations
					freq1[ref[r][c]-'A']++;
					freq2[guess[r][c]-'A']++;
				}
			}
		}

		int yellow = 0;
		for(int j=0; j<26; j++) {
			yellow += Math.min(freq1[j], freq2[j]);
		}

		System.out.println(green);
		System.out.println(yellow);
		in.close();
	}
}