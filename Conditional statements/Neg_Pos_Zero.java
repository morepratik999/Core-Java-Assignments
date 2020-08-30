import java.util.Scanner;

public class Neg_Pos_Zero {

	public static void main(String[] args) 
	{
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter a number : ");
		num=s.nextInt();
		
		if(num<0)
		{
			System.out.println("Given number is Negative.");
		}

		else if(num>0)
		{
			System.out.println("Given number is Positive.");
		}

		else if(num==0)
		{
			System.out.println("Given number is Zero.");
		}

	}

}
