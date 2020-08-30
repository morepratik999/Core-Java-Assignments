import java.util.Scanner;

public class WeekDay 
{
	public static void main(String args[])
	   {
	       Scanner d=new Scanner(System.in);
		   int weeknum;
		   System.out.println("Enter number between 1 to 7 and you will get corrosponding weekday as an output");
		   weeknum=d.nextInt();
		   if(weeknum==1)
		    {
			  System.out.print(" Sunday");
			}
			else if(weeknum==2)
			{
			   System.out.print(" Monday");
			}
			else if(weeknum==3)
			{
			System.out.println(" Tuesday");
			
			}
			
			else if(weeknum==4)
			{
			  System.out.print(" Wednessday");
			  
			}
			
			else if(weeknum==5)
			{
			  System.out.print(" thursday");
			  
			}
			
			else if(weeknum==6)
			{
			   System.out.print(" Friday");
			}
			
			else if(weeknum==7)
			{
			  System.out.print(" Saturday");
			}
	   }
}
