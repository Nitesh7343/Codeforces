import java.util.*;
public class B_Yuu_Koito_and_Minimum_Absolute_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int tc = 0;
        while(tc < t) {
            int n = sc.nextInt();
            int[] arr= new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] ans = new int[n];
            if(arr[0] == -1 && arr[n-1] == -1) {
                for(int i = 0; i < n;i++) {
                    if(arr[i] == -1) arr[i] = 0;
                }
            }
            else if(arr[0] == -1) {
                for(int i = 0; i < n;i++) {
                    if(arr[i] == -1) arr[i] = 0;
                }

                arr[0] = arr[n-1];
            }
            else if(arr[n-1] == -1) {
                for(int i = 0; i < n;i++) {
                    if(arr[i] == -1) arr[i] = 0;
                }

                arr[n-1] = arr[0];
            }
            else {
                for(int i = 0; i < n;i++) {
                    if(arr[i] == -1) arr[i] = 0;
                }
            }
            int sum = 0;

            for(int i = 0; i < n-1;i++) {
                sum += arr[i+1]-arr[i];
            }

            System.out.println(Math.abs(sum));
            for(int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            tc++;
        }
    }
}
