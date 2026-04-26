import java.util.*;
public class AOneAndTwo {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			long[] a = new long[(int) n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextLong();
			}
 
			long total2 = 0;
			long curr2 = 0;
 
			for (int i = 0; i < n; i++) {
				if (a[i] == 2) total2++;
			}
 
			long ans = -1;
			for (int i = 0; i < n; i++) {
				if (a[i] == 2) {
					curr2++;
				}
 
				if (curr2 == (total2 - curr2)) {
					ans = i + 1;
					break;
				}
			}
			System.out.println(ans);
		}
	}
}
