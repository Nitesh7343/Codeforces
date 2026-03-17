import java.util.*;
public class B_Cyclists {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n+1];

            for(int i = 1; i <= n; i++)
                a[i] = sc.nextInt();

            int minCost = Integer.MAX_VALUE;

            for(int i = 1; i <= k; i++)
                minCost = Math.min(minCost, a[i]);

            if(p <= k){
                System.out.println(m / a[p]);
                continue;
            }

            long cycleCost = (long)(p-1) * minCost + a[p];

            System.out.println(m / cycleCost);
        }
    }
}