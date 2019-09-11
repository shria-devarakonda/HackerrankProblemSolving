//functional knapsack 0 1 problem solution
//given inputs: testcases, n = number of values, capacity, n integers of values, n integers of weights

import java.util.*;
public class knapsack  
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        do{
            int n = sc.nextInt();
            int capacity = sc.nextInt();
            int[] values = new int[n];
            int[] weights=new int[n];
            for(int i =0; i<n;i++)
            {
               values[i] = sc.nextInt();
            }
            for(int j =0; j<n;j++)
            {
                weights[j] = sc.nextInt();
            }
            
            int[][] matrix = new int[n+1][capacity+1];
            for(int i =0; i<=n; i++)
            {
                for (int j =0; j<=capacity; j++)
                {
                    if(i==0 || j==0)
                    {
                        matrix[i][j] = 0;
                    }
                    else if (weights[i-1]<=j)
                    {
                        matrix[i][j] = Math.max(matrix[i-1][j], values[i-1] + matrix[i-1][j - weights[i-1]]);
                    }
                    else
                    {
                        matrix[i][j] = matrix[i-1][j];
                    }
                }
            }
            System.out.println(matrix[n][capacity]); 
        testcase--;
        }
        while(testcase!=0);
    }
    
}
