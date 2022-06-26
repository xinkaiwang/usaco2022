import java.util.*;
import java.io.*;
public class notlast {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("notlast.in"));
		PrintWriter out = new PrintWriter(new File("notlast.out"));

		int N = in.nextInt(); // # of records
		ArrayList<String> names = new ArrayList<>();
		names.add("Bessie");
		names.add("Maggie");
		names.add("Henrietta");
		names.add("Elsie");
		
		int[] mp = new int[7]; //milk production of the 7 cows
		for(int j=0; j<N; j++) {
			String name = in.next();
			int p = in.nextInt();
			
			int loc = names.indexOf(name);
			mp[loc] += p;
		}

		//find the 2nd lowest milk production, and the cow having this production
		//If there is only such cow, display her name; otherwise show "Tie".
		int min1 = mp[0];
		for(int k=0; k<7; k++) {
			if(mp[k]<min1) min1 = mp[k];
		}
		
		int min2 = Integer.MAX_VALUE;
		for(int k=0; k<7; k++) {
			if(mp[k]>min1 && mp[k]<min2) min2 = mp[k];
		}
		
		int cnt = 0; int id = -1;
		for(int k=0; k<7; k++) {
			if(mp[k]==min2) {
				cnt++; 
				id = k;
			}
		}
		
		if(cnt==1) {
			out.println(names.get(id));
		}
		else 
			out.println("Tie");
		in.close();
		out.close();
	}
}