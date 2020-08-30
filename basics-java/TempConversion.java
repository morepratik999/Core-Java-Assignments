import java.util.Scanner;

public class TempConversion 
{
	public static void main(String args[])
	   {  double temp, result;
	      char ch;
	      Scanner sc= new Scanner(System.in);
	      System.out.println("Enter the temperature in fahrenheit or degree celcius");
	      temp=sc.nextDouble();
	      System.out.println("PRESS c for fahrenheit to deree celcius  and PRESS f for celcius to fahrenheit");
	      ch=sc.next().charAt(0);
	      if(ch=='f')
	       {    
	           result=(temp*9/5)+32;
	           System.out.println("Temperature is "+result+" Fahrenheit");
	           
	       }

	       if(ch=='c')
	       {          
	           result=((temp-32)*5)/9;
	           System.out.println("Temperature is "+result+" Degree celcius");
	           
	       }
	      
	   }
}
