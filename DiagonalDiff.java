// The difference of diagonal sums of an n x n matrix
import java.util.*;
class DiagonalDiff
{
  
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int left = 0;
        int right = 0;
        for(int j = 0; j < n; j++)
        {
            for(int k = 0; k < n; k++)
            {
            int current = sc.nextInt();
            if(j == k){
                left = left + current;
            }
            if(j+k == (n-1)){
                right = right + current;
            }
            }
        }
        int ans = Math.abs(left-right);
        System.out.println(ans);
    }
}
