import java.util.*;
public class Pattern4
{
 public static void main(String args[])
{
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	
	int sp = 0;
        int str = n;
        for(int i = 1; i<=n; i++)
     {
       for(int j = 1; j <= sp; j++)
       {
  	System.out.print(" ");                     //System.out.print(" ");
       }
       for(int j = 1; j <= str; j++)
        {
         System.out.print("*");                 //System.out.print(" * ");
        }
         sp++;
         str--;
         System.out.println();
     }
}
}
					/*
					 *****
					  ****
					   ***
					    **
					     * 
					 */
