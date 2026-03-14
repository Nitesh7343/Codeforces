import java.util.*;
public class A_Bingo_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {

            int n = sc.nextInt();
            HashMap<Integer,Integer> freq = new HashMap<>();

            for(int i = 0; i < n*n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x,0) + 1);
            }

            boolean possible = true;

            for(int f : freq.values()) {
                if(f > n*(n-1)) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}