
import java.util.Scanner;
public class Marks1
{
	public static void main(String args[])
	   {  int Marathi,Mathematics,History,English,Java,Python,avg,total;
	      
		  Scanner sc=new Scanner(System.in);
	      System.out.println("Enter marks for Marathi : ");
	      Marathi=sc.nextInt();
	      System.out.println("Enter marks for Mathematics : ");
	      Mathematics=sc.nextInt();
	      System.out.println("Enter marks for History : ");
	      History=sc.nextInt();
	      System.out.println("Enter marks for English : ");
	      English=sc.nextInt();
	      System.out.println("Enter marks for Java : ");
	      Java=sc.nextInt();
	      System.out.println("Enter marks for Python: ");
	      Python=sc.nextInt();
	      total=Marathi+Mathematics+History+English+Java+Python;
	      avg=total/6;
	      System.out.println("Sum= "+total+" Average= "+avg);
	      
	   }
}
