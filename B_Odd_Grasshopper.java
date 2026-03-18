import java.util.*;
public class B_Odd_Grasshopper{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long n = sc.nextLong();

            long k = n % 4;

            if (x % 2 == 0) {
                if (k == 1) x -= n;
                else if (k == 2) x += 1;
                else if (k == 3) x += n + 1;
            } else {
                if (k == 1) x += n;
                else if (k == 2) x -= 1;
                else if (k == 3) x -= n + 1;
            }

            System.out.println(x);
        }
    }
}