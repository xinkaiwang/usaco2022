/*
 * Adding parentheses
 */
import java.util.*;
public class parentheses {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		ArrayList<Integer> ans = solve(str);
		Collections.sort(ans);
		for(int v : ans)
			System.out.print(v + " ");
		System.out.println();
		in.close();
	}
	
	static ArrayList<Integer> solve(String str) {
		ArrayList<Integer> ret = new ArrayList<>();

		int len = str.length();
        for(int j=0; j<len; j++) {
            char c = str.charAt(j);
            if(c == '*' || c == '-' || c == '+') {
                ArrayList<Integer> left = solve(str.substring(0, j));
                ArrayList<Integer> right = solve(str.substring(j+1, len));
                for(Integer x : left) {
                    for(Integer y : right) {
                    	if(c == '+' && !ret.contains(x+y)) 
                        	ret.add(x + y);
                        else if(c == '-' && !ret.contains(x-y)) 
                        	ret.add(x - y);
                        else if(c == '*' && !ret.contains(x*y)) 
                        	ret.add(x * y);
                    }
                }
            }
        }
        
        if(ret.isEmpty()) ret.add(Integer.parseInt(str));
        
        return ret;
	}
}