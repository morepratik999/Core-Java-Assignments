
public class CompundInterest 
{
     public static void main(String args[])
     {
    	 double  ci,p,t,r,n;  	
	       p=2000;
	       t=5;
	       n=12;
	       r=0.08;
	       ci=p*Math.pow((1+(r/n)), (n*t))-p;   
	       System.out.println("Compound Interest is "+ci);
     }
}
