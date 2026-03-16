import java.util.*;
public class B_Stone_Age_Problem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < n;i++){
            int num = sc.nextInt();
            map.put(i,num);
            sum += num;
        }
        boolean pq = false;
        int pv = 0;
        while(q-- > 0) {
            boolean q2 = sc.nextInt() == 2 ? true : false;
            if(q2) {
                pq = true;
                pv = sc.nextInt();
                sum = n*pv;
                System.out.println(sum);
            }
            else {
                int idx = sc.nextInt();
                int val = sc.nextInt();
                if(pq) {
                    sum = sum - pv + val;
                }
                else {
                    sum = sum - map.get(idx) + val;
                }
                map.put(idx,val);
                pq = false;
                System.out.println(sum);
            }
        }

    }
}