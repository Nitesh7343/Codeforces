import java.util.*;

public class B_Simply_Sitting_on_Chairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt() - 1;
            }
            
            boolean[] marked = new boolean[n];
            int ans = 0;
            
            for (int i = 0; i < n; i++) {
                if (marked[i]) break;
                if (p[i] > i) {
                    continue;
                }
                
                ans++;
                marked[p[i]] = true;
            }
            
            System.out.println(ans);
        }
    }
}