import java.util.*;
public class C_Vasilije_in_Cacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();

            long low = (k*(1+k))/2;
            //System.out.println(low);
            long high = (n*(1+n))/2 - ((n-k)*(1+(n-k)))/2;
            //System.out.println(high);

            if(x <= high && x >= low) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}