import java.util.Scanner;

public class EvenOdd 
{
   public static void main(String args[])
   {
	   int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter a number : ");
		num=s.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Given number is Even.");
		}

		else
		{
			System.out.println("Given number is Odd.");
		}

   }
}
