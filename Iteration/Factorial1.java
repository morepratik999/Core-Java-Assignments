import java.util.Scanner;

public class Factorial1{  
 public static void main(String args[]){ 
  Scanner s=new Scanner(System.in);
 
  int i, fact=1, number=0;  
  
System.out.println("Enter a number: ");
  number=s.nextInt();
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  