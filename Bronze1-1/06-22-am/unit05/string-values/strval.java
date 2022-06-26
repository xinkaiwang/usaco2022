/*
 * String value
 */
import java.util.*;
public class strval {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //# of strings
		String[] strs = new String[N];
		for(int j=0; j<N; j++)
			strs[j] = in.next();
		in.close();
		
		for(int j=0; j<N; j++) {
			int k=0;
			while(k<strs[j].length() && strs[j].charAt(k)=='A')
				k++;
			strs[j] = strs[j].substring(k);
		}

		int cnt = 0;
		for(int j=1; j<N; j++) {
			if(strs[j].length()<strs[0].length()) 
				continue;
			
			if(strs[j].length()>strs[0].length())
				cnt++;
			else if(strs[j].compareTo(strs[0])>0) { //equal lengths
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}