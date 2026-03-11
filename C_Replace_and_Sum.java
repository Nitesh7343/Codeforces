import java.util.*;
public class C_Replace_and_Sum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] a= new int[n];
            int[] b= new int[n];

            for(int i = 0 ; i < n;i++) {
                a[i] = sc.nextInt();
            }
            for(int i = 0 ; i < n;i++) {
                b[i] = sc.nextInt();
            }

            int max = 0;
            for(int i = n-1;i >= 0;i--) {
                max = Math.max(max,Math.max(a[i],b[i]));
                a[i] = max;
            }

            long[] prefix = new long[n];
            prefix[0] = a[0];
            for(int i = 1; i < n;i++) {
                prefix[i] = prefix[i-1]+a[i];
            }

            while(q-- > 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                long sum;
                if(x == 1) sum = prefix[y-1];
                else sum = prefix[y-1]-prefix[x-2];

                System.out.print(sum + " ");
            }

            System.out.println();
        }
    }
}