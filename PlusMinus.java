//Ratio of negative, postive and Zero terms in a array of n terms (Again non-array approach. I'm a space saver)
import java.util.Scanner;

class PlusMinus
{
    public static void main(String args[])
    {
        double neg =0.0;
        double pos =0.0;
        double zero =0.0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<n;i++)
        {
            int current = sc.nextInt();
            if (current<0)
            {
                neg++;
            }
            else if (current>0)
            {
                pos++;
            }
            else 
            {
                zero++;
            }
        }
        double ratioPos = pos/n;
        double ratioNeg = neg/n;
        double ratioZer = zero/n;
        System.out.println(ratioPos +"\n"+ratioNeg  +"\n" +ratioZer);
    }
}
