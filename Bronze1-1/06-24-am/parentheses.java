import java.util.*;

public class parentheses {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();  //expression
		in.close();
		
		ArrayList<Integer> ans = f(str);
		Collections.sort(ans);
		for(int x : ans)
			System.out.print(x + " ");
		System.out.println();
	}
	
	public static ArrayList<Integer> f(String str) {
		ArrayList<Integer> res = new ArrayList<>();
		//base case
		if(!str.contains("+") && !str.contains("-") && !str.contains("*"))
			res.add(Integer.parseInt(str));
		
		//go through all the operators at different locations
		//   break str into two parts s1 (to the left of the operator)
		//   and s2 (to the right of the operator)
		//
		// str[j] == '+', '-', '*'
		// s1 <= str[0 ... j-1];
		// s2 <= str[j+1 ... n-1], n = str.length()
		//
		// find the possible values of f(s1) and f(s2) recursively
		// add new possible numbers to res
		else {
			int n = str.length();
			for(int j=0; j<n; j++) {
				if(str.charAt(j)=='+' || str.charAt(j)=='-' || str.charAt(j)=='*') {
					String s1 = str.substring(0, j);  //[0, j)
					String s2 = str.substring(j+1);   //[j+1, n)
					ArrayList<Integer> list1 = f(s1);
					ArrayList<Integer> list2 = f(s2);
					 
					for(int x : list1) { //each value in list1
						for(int y : list2) { //each value in list2
							int tmp;
							if(str.charAt(j)=='+')
								tmp = x+y;
							else if(str.charAt(j)=='-')
								tmp = x-y;
							else
								tmp = x*y;
							
							if(!res.contains(tmp)) res.add(tmp);
						}
					}
				}
			}
		}
		
		return res;
	}
}