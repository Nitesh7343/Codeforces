import java.util.*;
public class A_Halloumi_Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n;i++) {
                a[i] = sc.nextInt();
            }
            if(sorted(a)) System.out.println("YES");
            else System.out.println(k < 2 ? "NO" : "YES");
        }
    }
    public static boolean sorted(int[] a) {
        for(int i = 0; i < a.length-1;i++) {
            if(a[i] > a[i+1]) return false;
        }
        return true;
    }
}