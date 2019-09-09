//another implementation of problem 6, fewer loops 
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str="#";
        for (int i=0;i<n;i++)
            { 
            System.out.printf("%"+(n+1)+"s",str+"\n");
            str=str+"#";
        }
    }
}
