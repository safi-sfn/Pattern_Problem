import java.util.Scanner;
public class pattern15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sp=n/2;
		int st=1;
		int val =1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=sp; j++)
			{
				System.out.print(" ");
			}
			int cval=val;
			for(int j=1; j<=st; j++)
			{
				System.out.print(cval);
				if(j<=st/2)
				{
					cval++;
				}
				else
				{
					cval--;
				}
				
			}
			if(i<=n/2)
			{
				sp--;
				st+=2;
				val++;
				
			}
			else {
				sp++;
				st-=2;
				val--;
			}
			//val++;
			System.out.println();
		}

	}

}
							/*
							   1
							  232
							 34543
							4567654
							 34543
							  232
							   1
							
							 */