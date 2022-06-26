/*
 * Word length product
 */
import java.util.*;
public class length {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int N = in.nextInt(); //# of words
    	String[] words = new String[N];
    	for(int j=0; j<N; j++)
    		words[j] = in.next();
    	in.close();
    	
    	int ans = 0;

    	//freq[j]: frequency of the letters in words[j]
    	int[][] freq = new int[N][26];
        for(int i=0; i<N; i++) {
            char[] A = words[i].toCharArray();
            for(int j=0; j<A.length; j++) {
                int c = A[j] - 'a';
                freq[i][c]++;
            }
        }

        for(int i=0; i<words.length-1; i++) {
            LABEL:
            for(int j=i+1; j<words.length; j++) {
                for(int k = 0; k < 26; k++) {
                    if(freq[i][k] != 0 && freq[j][k] != 0)
                        continue LABEL;
                }
                ans = Math.max(ans, words[i].length() * words[j].length());
            }
        }
        
        System.out.println(ans);
    }
}