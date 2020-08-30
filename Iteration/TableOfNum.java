import java.util.Scanner;

class TableOfNum
{
   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,i,result=0;
        System.out.println("Please enter a number");
        num=sc.nextInt();
        System.out.println("\n");
        for(i=1;i<=10;i++)
	{
  	    result=i*num;
            System.out.println(result); 
	}
    
    }

}