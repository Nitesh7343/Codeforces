import java.util.*;
public class A_Jellyfish_and_Undertale{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            int n = sc.nextInt();
            long[] tools = new long[n];
            
            for(int i = 0; i < n;i++) {
                tools[i] = sc.nextInt();
            }
            long ans = b;

            for(long num : tools) {
                ans += Math.min(num,a-1);
            }

            System.out.println(ans);
        }
    }
}