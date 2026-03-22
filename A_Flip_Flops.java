import java.util.*;

public class A_Flip_Flops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long k = sc.nextLong();
            //PriorityQueue<Long> pq = new PriorityQueue<>();
            Long[] arr = new Long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            boolean ans = false;
            for(int i = 0; i < n;i++) {
                long power = arr[i];
                if (power > c) {
                    System.out.println(c);
                    ans = true;
                    break;
                }
                
                if (k >= c - power) {
                    k -= (c - power);
                    c += (power + (c - power));
                } else {
                    c += power + k;
                    k = 0;
                }
            }
            if(!ans) System.out.println(c);
        }

    }
}