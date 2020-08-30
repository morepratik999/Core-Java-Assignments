import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); 
		System.out.println("Please enter two numbers to find maximum of two"); 
		int a = s.nextInt();
		int b = s.nextInt();
		if (a > b)
		{ 
			System.out.printf("maximum number is %d , Minimum number is %d", a, b);
		
		
		}
		else 
		{
			System.out.printf("maximum number is %d , Minimum number is %d", b, a);
			
			
		}

		
	}

}
