/*4.Calculate factorial of a number.*/

import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("<-- Find The Factorial Of Number Using -->");
		System.out.println("1. While Loop");
		System.out.println("2. do..while Loop");
		System.out.println("3. for Loop");
		System.out.println("4. Recursive Function");
		System.out.print("Enter Your Choice : ");
		int ch = sc.nextInt();
		System.out.println();
		System.out.print("Enter The Number : ");
		int num = sc.nextInt();
		System.out.println();
		int fact =1;
		switch(ch)
		{
			case 1 :
			
		  while(num>=1)
		{
			fact=fact*num;
			num--;
		}
		System.out.println("Factorial = "+fact);
		break;
		
		   case 2 :
		   
		 do
		{
			fact=fact*num;
			num--;
		}while(num>=1);
		System.out.println("Factorial = "+fact);
		break;
		
		  case 3 :
		  
		for(;num>=1;num--)
		{
			fact=fact*num;
		}
		System.out.println("Factorial = "+fact);
		break;
		
		case 4 :
		int Facti=MulNum(num);
		System.out.println("Factorial = "+Facti);
		break;

		
		default :
		 System.out.println("Enter Choice Between 1 To 4");
		}
		
	}
		 static int MulNum(int num)
		{
			
			if(num>=1)
			{
			  return num * MulNum(num-1); 
			}
			else
			{
				return 1;
			}
			
		}
};
