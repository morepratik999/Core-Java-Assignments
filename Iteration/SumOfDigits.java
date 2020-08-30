import java.util.Scanner;
class SumOfDigits
{
	public static void main(String arg[])	
	{
	    long n,sum;
             	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number ");
                   n=sc.nextLong();
                 long n1=n;
	    for(sum=0 ;n!=0 ;n/=10)
	    {
		sum+=n%10;
	    }
	    System.out.println("Sum of digits of a "+n1+" is : "+sum);               	  
	}
}