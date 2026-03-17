import java.util.*;
public class B_Odd_Grasshopper{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long x = sc.nextLong();
            long n = sc.nextLong();
            int i = 1;
            while(i <= n) {
                if(x%2 == 0) x = x-i;
                else x = x+i;

                i++;
            }

            System.out.println(x);
        }
    }
}