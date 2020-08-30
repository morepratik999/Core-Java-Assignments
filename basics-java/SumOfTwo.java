import java.util.Scanner;
public class SumOfTwo {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int num1,num2,sum=0;
		System.out.println("Enter 1st number: ");
		num1=s.nextInt();
		System.out.println("Enter 2nd number: ");
		num2=s.nextInt();
		sum=num1+num2;
		System.out.println("Sum of Two numbers is= "+sum);
	}

}
