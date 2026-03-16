import java.util.*;
public class B_NIT_Destroys_the_Universe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n;i++) {
                arr[i] = sc.nextInt();
            }
            int i = 0;
            int j = n-1;
            boolean f = false;
            while(arr[i] == 0 || arr[j] == 0) {
                if(arr[i] == 0) i++;
                if(arr[j] == 0) j--;
                if(i > j) {
                    System.out.println(0);
                    f = true;
                    break;
                }
            }
            if(f) continue;
            while(i < j) {
                if(arr[i] == 0) {
                    System.out.println(2);
                    f = true;
                    break;
                }
                i++;
            }
            if(f) continue;
            System.out.println(1);
        }
    }
}