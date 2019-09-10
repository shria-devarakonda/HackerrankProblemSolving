import java.util.*;
//Tallest candle/candles will be blown on birthday
class candle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int notc = sc.nextInt();
        int a=0;
        int tallest =0;
        for(int i=0; i<notc;i++)
        {
            int present = sc.nextInt();
            if(present>tallest)
            {
                tallest = present;
                a =1;
            }
            else if(present ==tallest)
            {
                a++;
            }
        }
        System.out.println(a);
    }
}
