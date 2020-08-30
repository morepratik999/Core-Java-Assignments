import java.util.Scanner;
public class Marks 
{
	public static void main(String args[])
	   {  int Marathi,Mathematics,History,English,Java,avg,total;
	      double per;
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
	      total=Marathi+Mathematics+History+English+Java;
	      
	      per=(total*100)/500;
	      System.out.println("Sum= "+total+"    percentage = "+per+"%");
	      if(per>=90)
	      {
	    	  System.out.println("Grade A ");
	      }

	      else if(per>=80)
	      {
	    	  System.out.println("Grade B ");
	      }
	      
	      else if(per>=70)
	      {
	    	  System.out.println("Grade C ");
	      }
	      else if(per>=60)
	      {
	    	  System.out.println("Grade D ");
	      }
	      else if(per>=40)
	      {
	    	  System.out.println("Grade E ");
	      }
	      else if(per<40)
	      {
	    	  System.out.println("Grade F ");
	      }
	     

	   }
}
