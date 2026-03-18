import java.util.*;
public class B_WOW_Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();

        long[][] dp = new long[n + 1][4];

        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == 'v' && s.charAt(i - 1) == 'v') {
                dp[i + 1][1] += dp[i - 1][0];
                dp[i + 1][3] += dp[i - 1][2];
            } else if (s.charAt(i) == 'o') {
                dp[i + 1][2] += dp[i][1];
            }

            dp[i + 1][1] += dp[i][1];
            dp[i + 1][2] += dp[i][2];
            dp[i + 1][3] += dp[i][3];
        }

        System.out.println(dp[n][3]); 
    }
}
