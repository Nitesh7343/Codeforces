import java.util.*;
public class B_Make_It_Increasing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i = 0; i < n;i++) {
                arr[i] = sc.nextLong();
            }
            if(n == 1) {
                System.out.println(0);
                continue;
            }
            int cnt = 0;
            for(int i = n-1; i >= 1;i--) {
                if(arr[i] == 1 && i >1) {
                    cnt = -1;
                    break;
                }
                while(arr[i] <= arr[i-1]) {
                    if(arr[i-1] == 0) {
                        cnt = -1;
                        break;
                    }
                    arr[i-1] /= 2;
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}