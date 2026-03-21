import java.util.*;
public class B_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                int less = 0, greater = 0;
                for (int j = i + 1; j < n; j++) {
                    if (a[j] < a[i]) less++;
                    else if (a[j] > a[i]) greater++;
                }
                sb.append(Math.max(less, greater));
                if (i < n - 1) sb.append(' ');
            }
            System.out.println(sb);
        }
    }
}