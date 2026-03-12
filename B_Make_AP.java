import java.util.*;
public class B_Make_AP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            boolean case1 = 2*b-c > 0 && (2*b-c)%a == 0;
            boolean case2 = (a + c) % 2 == 0 && ((a + c)/2) % b == 0;
            boolean case3 = 2*b-a > 0 && (2*b-a)%c == 0;

            System.out.println(case1 || case2 || case3 ? "YES" : "NO");
        }
    }
}