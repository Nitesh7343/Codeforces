import java.util.*;
public class A_Forked{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int kx = sc.nextInt();
            int ky = sc.nextInt();
            int qx = sc.nextInt();
            int qy = sc.nextInt();

            HashSet<ArrayList<Integer>> king = new HashSet<>();
            HashSet<ArrayList<Integer>> queen = new HashSet<>();

            int[] row = {-a,-a,a,a,b,-b,-b,b};
            int[] col = {-b,b,-b,b,-a,-a,a,a};

            for(int i = 0 ; i < 8;i++) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(kx+row[i]);
                temp.add(ky+col[i]);
                king.add(temp);
            }
            for(int i = 0 ; i < 8;i++) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(qx+row[i]);
                temp.add(qy+col[i]);
                queen.add(temp);
            }
            int ans = 0;
            for(ArrayList<Integer> temp: king){
                if(queen.contains(temp)) ans++;
            }
            System.out.println(ans);
        }
    }
}