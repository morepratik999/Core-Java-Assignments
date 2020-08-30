import java.util.*;

public class EvenOddRange
{
	public static void main(String args[])
	{   
               Scanner sc=new Scanner(System.in);
		int i,start=0,end=0;
               System.out.println("\nPlease enter range for even odd numbers: ");
                System.out.println("\nEnter start Numbers : ");
                start=sc.nextInt();

		System.out.println("\nEnter End Numbers : ");
                end=sc.nextInt();
                i=start;
                
		System.out.println("\n\nEven Numbers : ");
		while(i <= end)
		{
			if(i%2 == 0 )
				System.out.print(i+" ");
			i++;
		}
		System.out.println("\n");
	        j = start;
		System.out.println("Odd Numbers : ");
		while(j <= end)
		{
			if(j%2 != 0)
				System.out.print(j+" ");
			j++;
		}
		System.out.println("\n");
	}
}