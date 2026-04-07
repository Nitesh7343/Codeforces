import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class C_Grid_Covering {
    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            if (gcd(a, n) == 1 && gcd(b, m) == 1 && gcd(n, m) <= 2)
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }
        System.out.print(sb);
    }
}