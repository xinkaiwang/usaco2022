/*
 * Singularity
 */
import java.util.*;
public class singularity {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] str = in.next().toCharArray();
		in.close();
		
		int N = str.length;
		int cnt = 0;
		
		if(str[0]!=str[1]) {
			str[0] = str[1];
			cnt++;
		}
		for(int j=2; j<N-1; j++) {
			if(str[j]==str[j-1])
				continue;
			if(str[j]==str[j+1])
				continue;
			str[j] = str[j+1];
			cnt++;
		}

		if(str[N-1]!=str[N-2])
			cnt++;
		System.out.println(cnt);
	}
}