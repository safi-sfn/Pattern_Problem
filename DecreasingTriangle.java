import java.util.Scanner;

public class DecreasingTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn .nextInt();
		int sp = 0;
		int st = 2*n-1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=sp; j++)
			{
				System.out.print(" ");
			}
			for(int k=st; k>=1; k--)
			{
				System.out.print("*");
			}
			sp++;
		st-=2;
			System.out.println();
		}

	}

}

/*
 for value of n=5
 
*********   0-sp , 9-st
 *******    1-sp , 7-st
  ***** 	2-sp , 5-st
   ***		3-sp , 3-st
    *		4-sp , 1-st
 
 
 
 
 */
