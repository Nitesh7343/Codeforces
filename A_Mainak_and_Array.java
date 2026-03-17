import java.util.*;
public class A_Mainak_and_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n;i++) {
                arr[i] = sc.nextInt();
            }
            if(n == 1) {
                System.out.println(0);
                continue;
            }
            if(n == 2) {
                System.out.println(Math.abs(arr[1]-arr[0])); //use abs for n == 2
                continue;
            }
            // don't use abs anywhere
            int max = arr[n-1]-arr[0];

            int minT = Integer.MAX_VALUE;
            int maxT = Integer.MIN_VALUE;
            int maxDiff = Integer.MIN_VALUE;
            for(int i = 0; i < n;i++) {
                if(i != 0) maxT = Math.max(maxT,arr[i]);
                if(i != n-1) minT = Math.min(minT,arr[i]);
                if(i != 0) maxDiff = Math.max(maxDiff , arr[i-1]-arr[i]); // take in reverse direction (arr[i-1]-arr[i]) not (arr[i]-arr[i-1])
            }

            max = Math.max(max, Math.max(maxDiff, Math.max(maxT-arr[0],arr[n-1]-minT)));

            System.out.println(max);
        }
    }
}