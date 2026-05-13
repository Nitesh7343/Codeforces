import java.util.*;

public class BNotDividing {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) 
        {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n;i++) 
            {
                nums[i] = sc.nextInt();
                if(nums[i] == 1) nums[i]++;
            }
            System.out.print(nums[0]+" ");
            for(int i = 0; i < n-1;i++) {
                if(nums[i+1]%nums[i] == 0) 
                {
                    nums[i+1]++;
                }
                System.out.print(nums[i+1]+" ");
            }
            System.out.println();
        }
    }
}
