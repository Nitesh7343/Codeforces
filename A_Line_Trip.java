import java.util.*;

public class A_Line_Trip{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int maxDist = a[0]; // distance from 0 to first station

            for (int i = 1; i < n; i++) {
                maxDist = Math.max(maxDist, a[i] - a[i - 1]);
            }

            maxDist = Math.max(maxDist, 2 * (x - a[n - 1]));

            System.out.println(maxDist);
        }
    }
}