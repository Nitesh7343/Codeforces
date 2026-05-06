import java.util.*;
public class AExcitingBets 
{
    public static void main(String[] args) 
{

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) 
        {

            long a = sc.nextLong();
            long b = sc.nextLong();

            if(b > a)
            {
                long temp = a;
                a = b;
                b = temp;
            }

            long gcd = 0;
            long moves = 0;
            
            if(a != b) 
            {
                gcd = a - b;
                moves = Math.min(b%gcd,gcd-b%gcd);
            }

            System.out.println(gcd+" "+moves);
        }
    }
}
