import java.util.*;
public class C_Registration_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n;i++) arr[i] = sc.next();
        HashSet<String> set = new HashSet<>();
        for(String s : arr) {
            if(set.contains(s)) {
                int j = 1;
                while(set.contains(s+j)) {
                    j++;
                }
                System.out.println(s+j);
                set.add(s+j);
                }
            else {
                System.out.println("OK");
                set.add(s);
            }
        }
    }
    
}
