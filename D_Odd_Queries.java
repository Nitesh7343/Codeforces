import java.util.*;
public class D_Odd_Queries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for(int i = 0; i < n;i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            int[] prefix = new int[n];
            prefix[0] = arr[0];
            for(int i = 1; i < n;i++) {
                prefix[i] = prefix[i-1]+arr[i];
            }
            for(int i = 0; i < q; i++) {
                int l = sc.nextInt()-1;
                int r = sc.nextInt()-1;
                int k = sc.nextInt();
                int add = k * (r-l+1);
                int rangeSum = l == 0 ? prefix[r] : prefix[r]-prefix[l-1];
                int newSum = sum + add - rangeSum;
                System.out.println(newSum%2 == 0 ? "NO" : "YES");
            }
        }
    }
}