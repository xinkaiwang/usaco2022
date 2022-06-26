import java.util.*;
public class moobuzz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		
		//display the sequence
		for(int x=1; x<=N; x++) {
			//System.out.print(x + " ");
			if(x%15==0)
				System.out.print("Moobuzz ");
			else if(x%3==0)
				System.out.print("moo ");
			else if(x%5==0)
				System.out.print("buzz ");
			else
				System.out.print(x + " ");
		}
		
//		long t1 = System.currentTimeMillis();
//		//....
//		long t2 = System.currentTimeMillis();
//		System.out.println(t2 - t1);
	}
}
