/*
 * Cow string II
 */
import java.util.*;
public class cowstring2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); //# of strings
		int L = in.nextInt(); //length of each string
		int K = in.nextInt(); //K-th string unique

		int ub = (int) Math.pow(3, 15);
		boolean[] appeared = new boolean[ub];
		for(int j=0; j<n; j++) {
			String s = in.next();
			s = s.replaceAll("C", "0");
			s = s.replaceAll("O", "1");
			s = s.replaceAll("W", "2");
			appeared[Integer.parseInt(s, 3)] = true;
		}
		in.close();
	
		//find the k-th smallest integer v that hasn't appeared
		int count = 0;
		for(int v=0; v<ub; v++) {
			if(!appeared[v]) {
				count++;
				if(count<K) continue;
				
				String t = Integer.toString(v, 3);
				
				//add 0's to the front if necessary
				char[] T = new char[L];
				Arrays.fill(T, '0');
				for(int j=0; j<t.length(); j++) {
					T[L-1-j] = t.charAt(t.length()-1-j);
				}
				
				//convert back into a string
				String ans = new String(T);
				ans = ans.replaceAll("0", "C");
				ans = ans.replaceAll("1", "O");
				ans = ans.replaceAll("2", "W");
				System.out.println(ans);
				break;
			}
		}
	}
}
