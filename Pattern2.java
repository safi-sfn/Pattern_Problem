import java.util.*;
public class Pattern2
{
 public static void main(String args[])
{
  Scanner scn = new Scanner(System.in);
  
 int n = scn.nextInt();
    int i , j;
   
  for(i = n; i >= 1; i--)
{
   for(j = 1; j <=i ; j++)
  {
    System.out.print("* ");     
  }
  System.out.println();
}

}
}


						/*--------OUTPUT----------
						
						* * * * *
						* * * *
						* * * 
						* * 
						*
						*/