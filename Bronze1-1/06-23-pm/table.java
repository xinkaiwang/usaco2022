
public class table {

	public static void main(String[] args) {
		int n = 9;
		int[][] T = new int[n][n];
		for(int r=0; r<n; r++) {
			for(int c=0; c<n; c++) {
				
				T[r][c] = (r+1)*(c+1);
				
				System.out.printf("%3d", T[r][c]);
			}
			System.out.println();
		}
		System.out.println();
		
		//mapping: 0->A, 1->B, ..., 9->J
		for(int r=0; r<n; r++) {
			for(int c=0; c<n; c++) {
				if(T[r][c]<10)
					System.out.print("  " + (char)(T[r][c]+'A') );
				else
					System.out.print(" " + (char)(T[r][c]/10+'A') + (char)(T[r][c]%10+'A'));
			}
			System.out.println();
		}
		System.out.println();
		
		//assign the letters to an array
		char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		for(int r=0; r<n; r++) {
			for(int c=0; c<n; c++) {
				if(T[r][c]<10)
					System.out.print("  " + letters[ T[r][c] ]);
				else
					System.out.print(" " + letters[ T[r][c]/10 ] + letters[ T[r][c]%10 ]);
			}
			System.out.println();
		}
	}
}
