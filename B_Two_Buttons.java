import java.util.*;
public class B_Two_Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int steps = 0;
        while(n != m) {
            if(m > n && m%2 == 0) {
                m /= 2;
                steps++;
            }
            else{
                m++;
                steps++;
            }
        }
        System.out.println(steps);
        
    }
}
