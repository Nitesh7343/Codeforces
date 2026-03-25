import java.util.*;
public class A_DBMB_and_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            long x = sc.nextLong();
            long sum  = 0;
            for(int i = 0; i < n;i++) {
                sum += sc.nextLong();
            }
            if(sum >= s){
                System.out.println(sum == s ? "YES" : "NO");
                continue;
            }
            sum -= s;
            System.out.println(sum%x == 0 ? "YES" : "NO");
        }
    }
}