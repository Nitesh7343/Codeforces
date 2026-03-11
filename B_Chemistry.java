import java.util.*;
public class B_Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n= sc.nextInt();
            int k= sc.nextInt();

            String str = sc.next();
            HashMap<Character,Integer> map = new HashMap<>();
            for(char c : str.toCharArray()) {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            int ev = 0;
            int od = 0;
            for(int num : map.values()) {
                int temp = num%2 == 0 ? ev++ : od++;
            }

            System.out.println(od <= k+1 ? "YES" : "NO");
        }
    }
}
