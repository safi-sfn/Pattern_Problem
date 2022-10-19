import java.util.*;
public class Pattern3
{
 public static void main(String args[])
{
  Scanner scn = new Scanner(System.in);
  
 int n = scn.nextInt();
    int sp = n-1;
    int str = 1;

  for(int i = 1; i <= n; i++)
   {
     //System.out.print(sp + "," + str);
    
     for(int j = 1; j <= sp; j++)
{
   System.out.print(" ");                 //System.out.print(" ");
}
      for(int k = 1; k <= str; k++)
{
   System.out.print("*");                //System.out.print("*");
}
                                          
   sp--;                                         
    str++;                                   
    System.out.println();
   }
}
}

					/*
					    *
					   **
					  ***
					 ****
					*****
					 
					*/