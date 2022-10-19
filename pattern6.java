import java.util.Scanner;
public class pattern6 {


	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n =scn.nextInt();
		
			int st=n/2+1;
			int sp=1;
			
			for(int i =1; i<=n; i=i+1)
			{
				//System.out.print(st+","+sp+","+st);
				for(int j=1; j<=st; j++)
				{
					System.out.print("*");
				}
				for(int k=1; k<=sp; k++)
				{
					
				 System.out.print(" ");
				}
				for(int m=1; m<=st; m++)
				{
					System.out.print("*");
				}
				if(i<=n/2) {
					st--;
					sp+=2;
				}else {
					st++;
					sp-=2;
				}
				System.out.println();
			}
		}

	}

							/*
							*** ***
							**   **
							*     *
							**   **
							*** ***
							 */

