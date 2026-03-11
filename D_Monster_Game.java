import java.util.*;

public class D_Monster_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            long[] pref = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                pref[i] = pref[i - 1] + b[i - 1];
            }

            Arrays.sort(a);

            long ans = 0;

            for (int i = 0; i < n; i++) {
                int x = a[i];
                int cnt = n - i; 

                int lo = 0, hi = n;
                while (lo < hi) {
                    int mid = (lo + hi + 1) / 2;
                    if (pref[mid] <= cnt) lo = mid;
                    else hi = mid - 1;
                }

                ans = Math.max(ans, (long) x * lo);
            }

            System.out.println(ans);
        }
        sc.close();
    }
}