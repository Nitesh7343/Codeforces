import java.util.*;
public class A_Balanced_Bitstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int tc = 0; tc < t; tc++) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();
            boolean ans = true;

            for(int i = 0; i < k; i++) {
                char must = '?';

                for(int j = i; j < n; j += k) {
                    if(arr[j] != '?') {
                        if(must == '?') must = arr[j];
                        else if(must != arr[j]) {
                            ans = false; 
                            break;
                        }
                    }
                }

                if(!ans) break;

                if(must != '?') {
                    for(int j = i; j < n; j += k) {
                        arr[j] = must;
                    }
                }
            }

            if(!ans) {
                System.out.println("NO");
                continue;
            }

            int zeros = 0, ones = 0, un = 0;

            for(int i = 0; i < k; i++) {
                if(arr[i] == '0') zeros++;
                else if(arr[i] == '1') ones++;
                else un++;
            }

            if(ones > k/2 || zeros > k/2) ans = false;

            if(ans) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}