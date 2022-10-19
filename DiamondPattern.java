import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		// for normal pyramid  for(int i=1; i<=n; i--)
		 // for inverted pyramid for(int i=n; i>=1; i--)
		// agar pyramid or inverted pyramid ko ek saath chlana h t
		//  fir hum copy krne kebjaye use ek or for loop me add kr 
		  // denge for(int c=1; c<=2; c++)
		for(int c=2; c>=1; c--) 
		{
		for(int i=1; i<=n; i++) 
		{
			for(int s=1; s<=n-i; s++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
	}

}
					
					
	
						
						
						
					
				
					
							
							
