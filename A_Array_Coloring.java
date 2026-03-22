import java.util.*;

public class A_Array_Coloring {
    static List<Integer>[] graph;
    static int[] color;

    static boolean dfs(int node, int c) {
        color[node] = c;
        for (int nei : graph[node]) {
            if (color[nei] == -1) {
                if (!dfs(nei, c ^ 1)) return false;
            } else if (color[nei] == c) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] pos = new int[n + 1];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                pos[a[i]] = i;
            }

            graph = new ArrayList[n];
            for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();

            for (int i = 0; i < n - 1; i++) {
                graph[i].add(i + 1);
                graph[i + 1].add(i);
            }

            for (int x = 1; x < n; x++) {
                int u = pos[x];
                int v = pos[x + 1];
                graph[u].add(v);
                graph[v].add(u);
            }

            color = new int[n];
            Arrays.fill(color, -1);

            boolean ok = true;
            for (int i = 0; i < n; i++) {
                if (color[i] == -1) {
                    if (!dfs(i, 0)) {
                        ok = false;
                        break;
                    }
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}