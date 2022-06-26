import java.util.*;
public class samedigit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next() + ' ';
		in.close();
		
		int maxLen = 1;
		int loc = 0;
		for(int j=0; j<str.length();) {
			int k = j+1;
			while(k<str.length() && str.charAt(k)==str.charAt(j))
				k++;
			//k is the first index so that str[k] != str[j]
			
			if(k-j>maxLen) {
				maxLen = k-j;
				loc = j;
			}
			else if(k-j==maxLen && str.charAt(j)>str.charAt(loc)) {
				loc = j;
			}
			j = k;
		}
		System.out.println(str.substring(loc, loc+maxLen));
	}
}