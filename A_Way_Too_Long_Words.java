import java.util.*;
public class A_Way_Too_Long_Words{
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
           
            if(arr[i].length()>10)
            {
                arr[i]=""+arr[i].charAt(0)+(arr[i].length()-2)+arr[i].charAt(arr[i].length()-1);
            }
        }
        
        for(String x : arr)
        {
            System.out.println(x);
        }
        
	}
}
