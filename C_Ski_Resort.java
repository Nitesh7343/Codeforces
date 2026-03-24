import java.util.*;
public class C_Ski_Resort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();
            long cnt = 0;
            long ans = 0;
            while(n-- > 0) {
                long num = sc.nextLong();
                if(num <= q) cnt++;
                else {
                    if(cnt >= k) ans += ((cnt-k+1)*(cnt-k+2))/2;
                    cnt = 0;
                }
            }
            if(cnt >= k) ans += ((cnt-k+1)*(cnt-k+2))/2;
            System.out.println(ans);
        }
    }
}
