import java.util.*;
public class C_Raspberries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n;i++) {
                arr[i] = sc.nextInt();
            }
            int ans = k;
            int ev = 0;
            for(int num : arr) {
                ans = Math.min(ans,(k - num % k) % k);
                if(num%2 == 0) ev++;
            }
            if(k == 4) {
                ans = Math.min(ans,Math.max(0,2-ev));
            }

            System.out.println(ans);
            
        }
    }
}