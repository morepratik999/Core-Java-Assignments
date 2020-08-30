import java.util.Scanner;

class PrimeOrNot
{
    public static void main(String args[])
	{
          Scanner sc=new Scanner(System.in);
	  int i,num,flag=0;
          System.out.println("Please enter any number");
	  num=sc.nextInt();
          for(i=2;i<num;i++)
 	    {
		if(num%i==0)
		 {
   		    flag=1;
		   break;
                 }
	    }
	     
           if(flag==1)
		{
		   System.out.println("Given number is not prime number");
		}

	  else
		{
		    System.out.println("given number is Prime number");
		}
          
	}
}