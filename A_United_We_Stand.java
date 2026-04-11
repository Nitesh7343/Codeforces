import java.util.*;
public class A_United_We_Stand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i =0; i < n;i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int min = arr[0];
            List<Integer> b = new ArrayList<>();
            List<Integer> c = new ArrayList<>();
            if(n == 1) {
                System.out.println(-1);
                continue;
            }
            for(int i = 0; i < n;i++) {
                if(arr[i] == min) b.add(arr[i]);
                else c.add(arr[i]);
            }

            System.out.println(b.size() == 0 || c.size() == 0 ? -1 : b.size() +" "+c.size());
            if(b.size() == 0 || c.size() == 0) continue;
            for(int num : b) System.out.print(num+" ");
            System.out.println();
            for(int num : c) System.out.print(num+" ");
            System.out.println();

        }
    }
}
