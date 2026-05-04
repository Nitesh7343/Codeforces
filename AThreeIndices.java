import java.util.*;

public class AThreeIndices 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n;i++) arr[i] = sc.nextInt();

            int[] nse = new int[n];
            int[] pse = new int[n];

            Deque<Integer> dq = new ArrayDeque<>();
            
            for(int i = 0; i < n;i++) {
                while(!dq.isEmpty() && arr[dq.peek()] >= arr[i]) dq.pop();

                pse[i] = dq.isEmpty() ? -1 : dq.peek();
                dq.push(i);
            }

            dq.clear();

            for(int i = n-1; i >= 0;i--) 
                {
                while(!dq.isEmpty() && arr[dq.peek()] >= arr[i]) dq.pop();

                nse[i] = dq.isEmpty() ? -1 : dq.peek();
                dq.push(i);
            }

            int[] ans = new int[3];
            boolean found = false;

            for(int i = 0; i < n;i++) 
                {
                if(nse[i] != -1 && pse[i] != -1) 
                    {
                    ans[0] = pse[i];
                    ans[1] = i;
                    ans[2] = nse[i];
                    System.out.println("YES");
                    System.out.println(ans[0]+1+" "+ (ans[1]+1)+" "+(ans[2]+1));
                    found = true;
                    break;
                }
            }

            if(!found) System.out.println("NO");
        }
    }
}