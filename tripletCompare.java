#This code is to compare two sets of triplets
import java.util.*;

class tripletCompare
{
    public static void compareTriplets()
    {
        Scanner sc = new Scanner(System.in);  
        int a0 = sc.nextInt();
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b0 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        int Alice = ((a0>b0)?1:0) + ((a1>b1)?1:0) + ((a2>b2)?1:0);
        int Bob = ((a0<b0)?1:0) + ((a1<b1)?1:0) + ((a2<b2)?1:0);
        System.out.println(Alice +" " +Bob );

    }
    public static void main(String args[])
    {
        #This happened because the hackerrank compiler was throwing some errors
      compareTriplets();
    }
