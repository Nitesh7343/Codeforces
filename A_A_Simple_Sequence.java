import java.util.*;
public class A_A_Simple_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] ans = new int[n];
            ans[0] = 2;
            int k = 1;
            while(n >=  3) {
                ans[k++] = n--;
            }
            ans[ans.length -1] = 1;
            for(int num : ans) System.out.print(num+" ");
            System.out.println();
        }
    }
}
