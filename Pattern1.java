import java.util.*;
public class Pattern1
{
 public static void main(String args[])
{
  Scanner scn = new Scanner(System.in);
  
 int n = scn.nextInt();
    int v , p;
   
  for(v=1; v<=n; v++)
{
   for(p=1; p<=v; p++)
  {
    System.out.print("*");    //("*\t") \t for tab
  }
  System.out.println();
}

}
}

					/*--------OUTPUT--------
					*
					* *
					* * *
					* * * *
					* * * * *
					*/