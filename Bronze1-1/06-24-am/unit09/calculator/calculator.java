/*
 * Implement a simple calculator with +, -, and ().
 */
import java.util.*;
public class calculator {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();

		System.out.println(solve(s));
    }

    public static int solve(String s) {
    	int ans = 0;

    	int sign = 1;
    	int N = s.length();
    	for(int j=0; j<N; ) {
    		char ch = s.charAt(j);
    		if(ch=='(') { //find the matching ) and evaluate the substring
    			int left = 1; //# of extra '('
    			int k = j+1;
    			while(k<N) {
    				if(s.charAt(k)=='(')
    					left++;
    				else if(s.charAt(k)==')')
    					left--;
    				if(left==0) break;
    				k++;
    			} //s[k] has the matching ')'
    			ans += sign * solve(s.substring(j+1, k));
    			j=k+1;
    		}

    		else if(ch=='+') {
    			sign = 1; j++;
    		}
    		
    		else if(ch=='-') {
    			sign = -1; j++;
    		}
    		
    		else if('0'<=ch && ch<='9') {
    			//find the integer
    			int val = ch-'0';
    			int k = j+1;
    			while(k<N) {
    				char ch2 = s.charAt(k);
    				if('0'<=ch2 && ch2<='9') {
    					val = val*10 + (ch2-'0');
    					k++;
    				}
    				else //no longer a digit
    					break;
    			}
    			
    			ans += sign * val;
    			j = k;
    		}
    		else
    			j++;
    	}
    	
    	return ans;
    }
}
