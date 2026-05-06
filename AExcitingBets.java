import java.util.*;
public class AExcitingBets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if(b > a) {
                long temp = a;
                a = b;
                b = temp;
            }

            if(a == b) {
                System.out.println(0+" "+0);
            }
            else {
                long gcd = a - b;
                long moves = Math.min(b%gcd,gcd-b%gcd);

                System.out.println(gcd+" "+moves);
            }
        }
    }
}
