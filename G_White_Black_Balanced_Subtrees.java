import java.util.*;
public class G_White_Black_Balanced_Subtrees {
    
    static int ans;
    static ArrayList<ArrayList<Integer>> adj;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            ans = 0;
            adj = new ArrayList<>();
            for(int i = 0; i <= n;i++) {
                adj.add(new ArrayList<>());
            }

            for(int i = 0; i < n-1;i++) {
                int parent = sc.nextInt();
                adj.get(parent).add(i+2);
            }

            String s = sc.next();

            dfs(1,s);

            System.out.println(ans);
        }
    }
    static int dfs(int node, String s) {
        
        if(adj.get(node).size() == 0) {
            return s.charAt(node-1) == 'W' ? 1 : -1;
        }

        int count = 0;
        for(int it : adj.get(node)) {
            count += dfs(it,s);
        }

        count += s.charAt(node-1) == 'W' ? 1 : -1;

        ans += count == 0 ? 1 : 0;
        return count;
    }
}