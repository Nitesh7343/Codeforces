import java.util.*;
public class C_Find_the_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = -1;
            boolean found = false;

            for (int i = 1; i <= 2 * n - 1; i += 2) {
                System.out.println("? " + i + " " + (i + 1));
                System.out.flush();
                int res = sc.nextInt();
                if (res == -1) return;
                if (res == 1) {
                    ans = i;
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("? 1 3");
                System.out.flush();
                int res = sc.nextInt();
                if (res == -1) return;
                if (res == 1) {
                    ans = 1;
                } else {
                    ans = 2;
                }
            }

            System.out.println("! " + ans);
            System.out.flush();
        }
    }
}