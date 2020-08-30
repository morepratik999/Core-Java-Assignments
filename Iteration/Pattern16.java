/*

*
***
*****
*******
*********
*******
*****
***
*

*/
import java.util.Scanner;

public class Pattern16
{
	public static void main(String args[])
	{
		int n=1;
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=n ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			n=n+2;
		}
		n=n-4;
		for(int i=1 ; i<=4 ; i++)
		{
			for(int j=1 ; j<=n ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			n=n-2;
		}
	}
}
			