import java.util.*;
public class B_Prefix_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ;i < n;i++) {
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            for(int num : arr) if(num > max) max = num;
            System.out.println(max*n);
        }
    }
}