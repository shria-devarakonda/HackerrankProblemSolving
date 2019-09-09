#Sum of an array, given the number of elements in the array

import java.util.*;

public class arraysum
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();

      int sum =0;
      for(int i =0; i<a; i++)
      {
          sum = sum+(sc.nextInt());
      }
      System.out.println(sum);
  }
}
