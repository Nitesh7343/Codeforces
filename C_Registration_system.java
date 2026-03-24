import java.util.*;
public class C_Registration_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        HashMap<String,Integer> map = new HashMap<>();
        while(n-- > 0) {
            String s = sc.next();
            if(map.containsKey(s)) {
                int cnt = map.get(s);
                String newS = s+cnt;
                System.out.println(newS);
                map.put(s,cnt+1);
            }
            else{
                System.out.println("OK");
                map.put(s,1);
            }
        }
    }
    
}
