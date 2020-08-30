import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
    	System.out.println("Enter any Year:");
    	int year = s.nextInt();
        int flag = 0;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
           
                if ( year % 400 == 0)
                    flag = 1;
                else
                    flag = 0;
            }
            else
                flag = 1;
        }
        else
            flag = 0;

        if(flag==1)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}
