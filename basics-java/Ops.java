import java.util.*;
public class Ops {
	public static void main(String args[])
	{   Scanner sc=new Scanner(System.in);
		int n1,n2,add,sub,mul,div,rem;
		System.out.println("Enter 1st number : ");
		n1=sc.nextInt();
		System.out.println("Enter 2nd number :  ");
		n2=sc.nextInt();
		add=n1+n2;
		sub=n1-n2;
		mul=n1*n2;
		div=n1/n2;
		rem=n1%n2;
		System.out.println("Addition is= "+add+"\nSubtraction is= "+sub+"\nMultiplication is= "+mul+"\nDivision is= "+div+"\nRemainder is= "+rem);
	}

}
