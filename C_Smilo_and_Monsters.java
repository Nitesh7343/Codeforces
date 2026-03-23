import java.util.*;
public class C_Smilo_and_Monsters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            long sum = 0;
            for(int i = 0; i < n;i++) {
                arr[i] = sc.nextLong();
                sum += arr[i];
            }
            Arrays.sort(arr);
            long rem = sum/2;
            long ans = sum-rem;
            // for(int i = n-1; i >= 0;i--) {
            //     if(rem <= 0) break;
            //     rem -= arr[i];
            //     ans++;
            // }
            System.out.println(ans);
        }
    }
    
}
