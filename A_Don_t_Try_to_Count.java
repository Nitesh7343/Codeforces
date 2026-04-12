import java.util.*;
public class A_Don_t_Try_to_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            StringBuilder x = new StringBuilder(sc.next());
            String s = sc.next();

            int cnt = 0;

            while (x.length() < s.length()) {
                x.append(x);
                cnt++;
            }
            boolean ans = false;
            for (int i = 0; i < 2; i++) {
                if (x.toString().contains(s)) {
                    System.out.println(cnt);
                    ans = true;
                    break;
                }
                x.append(x);
                cnt++;
            }
            
            if(!ans)System.out.println(-1);
        }
    }
}