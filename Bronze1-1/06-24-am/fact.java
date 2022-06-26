
public class fact {

	//find the factorial of n recursively
	public static int f(int n) {
		if(n<=1)
			return 1;
		else
			return n * f(n-1);
	}

	public static void main(String[] args) {
		
		int n = 9;
		System.out.println(f(n));
	}
	
}
