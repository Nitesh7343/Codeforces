import java.util.*;
public class A_Doremy_s_Paint_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0 ; i < n;i++) {
                int num = sc.nextInt();
                map.put(num,map.getOrDefault(num,0)+1);
            }
            if(map.size() > 2) {
                System.out.println("NO");
                continue;
            }
            if(map.size() == 1) {
                System.out.println("YES");
                continue;
            }
            int[] diff = new int[2];
            int k = 0;
            for(int num : map.values()) {
                diff[k++] = num;
            }
            System.out.println(Math.abs(diff[0]-diff[1]) > 1 ? "NO" : "YES");
        }
    }
}