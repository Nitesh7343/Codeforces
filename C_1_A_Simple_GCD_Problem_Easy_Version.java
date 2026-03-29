import java.util.*;
public class C_1_A_Simple_GCD_Problem_Easy_Version {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();

        }
    }
    
    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}