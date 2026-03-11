import java.util.*;
public class B_Reverse_a_Permutation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n;i++) {
                arr[i]= sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int mV = arr[i];
                int mIdx = i;
                
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] > mV) {
                        mV = arr[j];
                        mIdx = j;
                    }
                }
                
                if (mIdx != i) {
                    reverse(arr, i, mIdx);
                    break;
                }
            }
            for(int num : arr) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    public static void reverse(int[] nums, int i, int j) {
        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}