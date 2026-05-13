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

            for(int i = 0; i < n-1;i++) {
                if(nums[i+1]%nums[i] == 0) nums[i+1]++;
            }

            for(int num : nums) System.out.print(num+" ");
            System.out.println();
        }
    }
}
