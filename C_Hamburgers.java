import java.util.*;
public class C_Hamburgers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rcp = sc.nextLine();
        
        long[] inKitchen = new long[3];
        for(int i = 0; i < 3; i++){
            inKitchen[i] = sc.nextLong();
        }
        
        long[] prices = new long[3];
        for(int i = 0; i < 3; i++){
            prices[i] = sc.nextLong();
        }
        
        long r = sc.nextLong();

        int cB = 0 , cS = 0 , cC = 0;
        for(char c : rcp.toCharArray()) {
            if(c == 'B') cB++;
            if(c == 'S') cS++;
            if(c == 'C') cC++;
        }

        long left = 0, right = (long)1e13, ans = 0;
        while(left <= right) {
            long mid = (left + right) / 2;
            
            long needB = Math.max(0, cB * mid - inKitchen[0]);
            long needS = Math.max(0, cS * mid - inKitchen[1]);
            long needC = Math.max(0, cC * mid - inKitchen[2]);
            
            long cost = needB * prices[0] + needS * prices[1] + needC * prices[2];
            
            if(cost <= r) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }   
        }
        System.out.println(ans);
    }
}