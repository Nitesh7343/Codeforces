import java.util.*;
public class B_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i = 0; i < n;i++) {
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i < n;i++) {
                int min = 0;
                int max = 0;
                for(int j = i+1; j < n;j++) {
                    if(arr[i] < arr[j]) max++;
                    else if(arr[i] > arr[j]) min++;
                }
                System.out.print(min > max ? min+" " : max+" ");
            }
            System.out.println();
        }
    }
}