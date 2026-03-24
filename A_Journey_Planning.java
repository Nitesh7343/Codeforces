import java.util.*;
public class A_Journey_Planning {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        HashMap<Integer, Long> poss = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int key = i - b[i];

            poss.put(key, poss.getOrDefault(key, 0L) + b[i]);
        }

        long ans = 0;

        for (long value : poss.values()) {
            ans = Math.max(ans, value);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        solve(sc);

        sc.close();
    }
}