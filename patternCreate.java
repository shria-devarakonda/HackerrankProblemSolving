//create a pattern of #s using n as inputs to how many lines. detailed explanation on hackerrank, will update soon
import java.util.*;

class patternCreate
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0 ; i<n ;i++)
        {
            for(int j = 0; j <= n-i-2; j++)
            {
                System.out.print(" ");
            }
            for(int j = n-i-1 ; j< n; j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }  
}
