
public class SwapTwoNum
{
       public static void main(String args[])
       {
    	   int a=10;
    	    int b=20;
    	     int c=10;
    	    int d=20;
    	    int temp=0;

    	    temp=a;
    	    a=b;
    	    b=temp;
    	   System.out.println("Using 3rd variable\na= "+a+"      b= "+b+"\n");
    	    
    	   c=c+d;
    	   d=c-d;
    	   c=c-d;
    	System.out.println("Using Two variable by applying + and - ops. swap method\na= "+a+"      b= "+b+"\n");

    	   c=c*d;

    	   d=c/d;
    	   c=c/d;
    	 System.out.println("Using Two variable by applying / and * ops. swap method\na= "+a+"      b= "+b+"\n");

       }
}
