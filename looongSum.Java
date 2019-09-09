//Find a sum of numbers that surpass the limit of integers. ez. could also be done with help of array but you dont need it. extra space
import java.util.Scanner;

class looongSum
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      long sum =0;
      for(int i =0; i<a; i++)
      {
          sum = sum + sc.nextInt();
      }
    System.out.println(sum);
    }
}
