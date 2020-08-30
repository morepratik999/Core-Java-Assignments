import java.util.Scanner;
public class YearWeekDay 
{
	 public static void main(String args[])

	    {
		    Scanner s=new Scanner(System.in);
	        System.out.println("Enter number of days: ");
	        int num=s.nextInt();
	        int y,w,d,r,r1;

	        y=num/365;
	        r=num%365;
	        w=r/7;
	        r1=r%7;
	        d=r1;
	        System.out.println(y+" year(s)\n"+w+" week(s)\n"+d+"day(s)\n");        


	    }

}
