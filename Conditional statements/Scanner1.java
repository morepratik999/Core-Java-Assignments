import java.util.Scanner;

public class Scanner1 {
	
     public static void main(String args[])

      { 	 String n,address;
             
      		Scanner sc=new Scanner(System.in);
         	System.out.println("Enter your name...");
         	n= sc.next();
            System.out.println("\nEnter your address ");
         	address=sc.nextLine();
         	System.out.println("\nYour name and address is "+n+"\n"+address);
     
         	 System.out.println("\nEnter any Integer of number: ");
             int l = sc.nextInt();
             System.out.println("Integer number: "+l);

             
             System.out.println("\nEnter any Float type of number: ");
             float k = sc.nextFloat();
             System.out.println("Float number: "+k);

             System.out.println("\nEnter any Double type of  number: ");
             double j = sc.nextDouble();
             System.out.println("Double number: "+j);




      	}
}
