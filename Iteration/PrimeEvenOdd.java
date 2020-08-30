import java.util.Scanner;

public class PrimeEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		int ch;
		
		String even="",odd="";
		while(true)
		{
		System.out.println("press 1 for prime numbers.\npress 2 for even numbers..\npress 3 for odd numbers..\npress 4 to EXIT..\n");
		ch=sc.nextInt();
		switch(ch)
		{
		
		case 1 :
		     System.out.println("Prime numbers are :");
	       for (i=1;i<=100;i++)         
	       { 	
	          int counter=0; 	  
	          for(j=i; j>=1; j--)
		  {
	             if(i%j==0)
		     {
	 		counter++;
		     }
		  }
		  if (counter ==2)
		  {
		     System.out.print(i+" ");
		  }	
	       }
	       System.out.println("\n");
	       break;
	       
		case 2:
			for (i=1;i<=100;i++)         
		       { 	
		    	   if(i%2==0)
		    	   {
		    		   even=even+i+ " ";
		    	   }
		       }  
	       System.out.println("\n\nEven numbers are : ");
	       System.out.print(even+"\n\n");
	       break;
	       
		case 3:
			for (i=1;i<=100;i++)         
		       { 	
		    	   if(i%2!=0)
		    	   {
		    		   odd=odd+i+ " ";
		    	   }
		       }   
	       System.out.println("\n\nOdd numbers are :");
	       System.out.println(odd+"\n\n");
	       break;
		
		}
		if(ch==4)
		{break;}
	  }		

    }
}
