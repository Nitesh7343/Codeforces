import java.util.*;
public class A_Bingo_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

       while(t-- > 0) {
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean no = false;

        for(int i = 0; i < n;i++) {
            for(int j = 0; j < n;j++) {
                int num = sc.nextInt();
                map.put(num,map.getOrDefault(num,0)+1);
                if(map.get(num) > n*(n-1)) {
                    no = true;
                }
            }
        }
        System.out.println(no ? "NO" : "YES");
       }
    }
}