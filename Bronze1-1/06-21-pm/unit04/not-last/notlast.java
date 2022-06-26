/*
 * Not last (Jan 2017) 
 */
import java.io.*;
import java.util.*;
public class notlast {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("notlast.in"));
		PrintWriter out = new PrintWriter(new File("notlast.out"));

		ArrayList<String> names = new ArrayList<String>(Arrays.asList(
				"Annabelle", "Bessie", "Daisy", "Elsie", "Gertie",
				"Henrietta", "Maggie"));
		int[] mp = new int[7]; //milk production of the 7 cows
		
		int N = in.nextInt();  //# of records
		for(int j=0; j<N; j++) { //for each record
			String name1 = in.next();  //name of the cow
			int p = in.nextInt();  //one production of the cow
			
			int id = names.indexOf(name1);
			mp[id] += p;
		}
		
		//find the lowest and second lowest milk production
		int min1 = Integer.MAX_VALUE;  //lowest production
		for(int j=0; j<7; j++) {
			if(mp[j] < min1) 
				min1 = mp[j];
		}
		
		int min2 = Integer.MAX_VALUE;  //second lowest production
		int count = 0;  //# of cows with the second lowest production
		int loc = -1;   //location of the second lowest production if count=1
		for(int j=0; j<7; j++) {
			if(mp[j]>min1 && mp[j]<min2) {
				min2 = mp[j];
				loc = j;
				count = 1;
			}
			else if(mp[j]==min2) {
				count++;
			}
		}
	
		if(count==1) //unique cow with the second lowest production
			out.println(names.get(loc));
		else
			out.println("Tie");
		
		in.close();
		out.close();
	}
}
