import java.util.*;
public class A_AvtoBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            if(n%2 != 0 || n <4) {
                System.out.println(-1);
                continue;
            }
            long min;
            long max;
            if(n%6 == 0) min = n/6;
            else min = n/6 +1;

            if(n%4 == 0) max = n/4;
            else max = n/4;

            System.out.println(min+" "+max);

        }
    }
}