import java.util.*;
public class B_Flip_the_Bit_Easy_Version {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            long sum = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
               
            }
            int idx = sc.nextInt()-1;
            int i = 0;
            int j = n-1;
            int count1 = 0;
            int count2 = 0;
            while(j>=idx){
                if(arr[j] != arr[idx] && count1%2 == 0){
                    count1++;
                }
                else if(arr[j] == arr[idx] && count1%2 == 1){
                    count1++;
                }
                j--;
                
            }
            while(i<=idx){
                if(arr[i] != arr[idx] && count2%2 == 0){
                    count2++;
                }
                else if(arr[i] == arr[idx] && count2%2 == 1){
                    count2++;
                }
                i++;
                
            }
            System.out.println(Math.max(count1,count2));
            
        }
    }

}