import java.util.*;
public class B_The_67_th_6_7_Integer_Problem {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int nsum = 0;
            int max = 0;
            for(int i = 0; i < 7;i++) {
                int num = sc.nextInt();
                max = Math.max(num, max);
                nsum += (-1*num);
            }
            System.out.println(nsum + 2*max);
        }
    }
}