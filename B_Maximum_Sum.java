import java.util.*;
public class B_Maximum_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long prefix[] = new long[n];
            long[] arr = new long[n];
            for(int i = 0; i < n;i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            long sum = 0;
            for(int i = 0; i < n;i++) {
                sum += arr[i];
                prefix[i] = sum;
            }
            long max = 0;
            long curr = 0;
            for(int i = 0; i <= k;i++) {
                curr = ((k-i)*2)-1 >= 0 ? prefix[n-i-1] - prefix[((k-i)*2)-1] : prefix[n-i-1];
                max = Math.max(max,curr);
            }

            System.out.println(max);
        }
    }
}