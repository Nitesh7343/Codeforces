import java.util.*;

public class A_Flip_Flops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long c = sc.nextLong();
            long k = sc.nextLong();
            PriorityQueue<Long> pq = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                pq.add(sc.nextLong());
            }
            boolean ans = false;
            while (!pq.isEmpty()) {
                long power = pq.poll();
                if (power > c) {
                    System.out.println(c);
                    ans = true;
                    break;
                } else if (power == c) {
                    c += power;
                } else {
                    if (k >= c - power) {
                        k -= (c - power);
                        c += (power + (c - power));
                    } else {
                        c += power + k;
                        k = 0;
                    }
                }
            }
            if(!ans) System.out.println(c);
        }

    }
}