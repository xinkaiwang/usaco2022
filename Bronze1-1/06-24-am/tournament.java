import java.io.*;
import java.util.*;

public class tournament {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(matchesPlayed(n));
    }
    public static int matchesPlayed(int n) {
        if (n <= 1) {
            return 0;
        }
        if (n % 2 == 1) {
            return (n-1)/2 + matchesPlayed((n-1)/2 + 1);
        }
        else {
            return n/2 + matchesPlayed(n/2);
        }
    }
}
