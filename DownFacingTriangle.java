import java.util.Scanner;
public class DownFacingTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=2*n-1; j++)
			{
				
				if(i==j)
				{
					System.out.print("*");
					
				}
				else if( i<j && i>j)
				{
					System.out.print(" ");
				}
				else
				{
					//System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
