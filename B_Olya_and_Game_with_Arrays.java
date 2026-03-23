import java.util.*;
public class B_Olya_and_Game_with_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            ArrayList<ArrayList<Long>> lst = new ArrayList<>();
            for(int i = 0; i < n;i++) {
                int m = sc.nextInt();
                ArrayList<Long> temp = new ArrayList<>();
                for(int j = 0; j < m;j++) {
                    temp.add(sc.nextLong());
                }
                Collections.sort(temp);
                lst.add(temp);
            }
            long min = Long.MAX_VALUE;
            long min2 = Long.MAX_VALUE;
            long sum = 0;
            for(int i = 0; i < n;i++) {
                if(lst.get(i).get(0) < min) {
                    min = lst.get(i).get(0);
                }
                if(lst.get(i).get(1) < min2) {
                    min2 = lst.get(i).get(1);
                }
            }
            for(int i = 0; i < n;i++) {
                sum += lst.get(i).get(1);
            }
            System.out.println(sum - min2 + min);
        }
    }
}