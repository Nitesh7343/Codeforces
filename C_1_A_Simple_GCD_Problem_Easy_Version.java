import java.util.*;

public class C_1_A_Simple_GCD_Problem_Easy_Version {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
            for (int i = 0; i < n; i++) sc.nextLong();

            long[][] rg = new long[n + 1][];
            rg[n] = new long[0];

            long[] cur = new long[0];

            for (int i = n - 1; i >= 0; i--) {
                long[] nxt = new long[cur.length + 1];
                nxt[0] = a[i];
                int sz = 1;

                for (long g : cur) {
                    long ng = gcd(g, a[i]);
                    if (ng != nxt[sz - 1]) {
                        nxt[sz++] = ng;
                    }
                }

                rg[i] = Arrays.copyOf(nxt, sz);
                cur = rg[i];
            }

            long[] lc = new long[0];
            int ans = 0;

            for (int i = 0; i < n; i++) {
                long lval = 1;
                boolean notChg = false;

                for (long s : lc) {
                    long g = gcd(a[i], s);
                    lval = lval / gcd(lval, g) * g;
                    if (lval == a[i]) {
                        notChg = true;
                        break;
                    }
                }

                if (!notChg && i + 1 < n) {
                    for (long s : rg[i + 1]) {
                        long g = gcd(a[i], s);
                        lval = lval / gcd(lval, g) * g;
                        if (lval == a[i]) {
                            notChg = true;
                            break;
                        }
                    }
                }

                if (!notChg) ans++;

                long[] nxt = new long[lc.length + 1];
                nxt[0] = a[i];
                int sz = 1;

                for (long g : lc) {
                    long ng = gcd(g, a[i]);
                    if (ng != nxt[sz - 1]) {
                        nxt[sz++] = ng;
                    }
                }

                lc = Arrays.copyOf(nxt, sz);
            }

            System.out.println(ans);
        }
    }
    static long gcd(long a, long b) {
        while (b != 0) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}