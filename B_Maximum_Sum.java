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
            prefix[0] = arr[0];
            for(int i =1; i < n;i++) {
                prefix[i] = prefix[i-1]+arr[i];
            }

            long curr = 0;
            long max = 0;
            for(int i = 0; i <= k;i++) {
                curr = 2*(k-i)-1 >= 0 ? prefix[n-i-1]-prefix[2*(k-i)-1] : prefix[n-i-1] ;
                max = Math.max(curr,max);
            }

            System.out.println(max);
        }
    }
}