/*
 * Cross word (Dec 2014)
 */
import java.io.*;
import java.util.*;
public class crosswords {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("crosswords.in"));
		PrintWriter out = new PrintWriter(new File("crosswords.out"));
		
		int n = in.nextInt(); //# of rows
		int m = in.nextInt(); //# of columns
		
		char[][] grid = new char[n][m];
		for(int r=0; r<n; r++)
			grid[r] = in.next().toCharArray();

		int count = 0;
		ArrayList<Integer> X = new ArrayList<>(); //store clue start position
		ArrayList<Integer> Y = new ArrayList<>(); //  (r, c) coordinates
		for(int r=0; r<n; r++) {
			for(int c=0; c<m; c++) {
				if(grid[r][c]=='#')
					continue;
				
				boolean flag = false;
				
				//check horizontally
				if(c<m-2) {
					if(c==0 || (c>0 && grid[r][c-1]=='#')) {
						if(grid[r][c+1]=='.' && grid[r][c+2]=='.') {
							count++;
							X.add(r+1);
							Y.add(c+1);
							flag = true;
						}
					}
				}
				
				//check vertically
				if(r<n-2 && !flag) {
					if(r==0 || (r>0 && grid[r-1][c]=='#') ) {
						if(grid[r+1][c]=='.' && grid[r+2][c]=='.') {
							count++;
							X.add(r+1);
							Y.add(c+1);
						}
					}
				}
			}
		}
		
		out.println(count);
		
		for(int k=0; k<X.size(); k++)
			out.println(X.get(k) + " " + Y.get(k));
		
		out.close();
		in.close();
	}
}
