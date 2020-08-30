import java.util.Scanner;

public class CharUpperLower {

	public static void main(String[] args) 
	{
	     char ch;
	     Scanner s= new Scanner(System.in);
	     System.out.println("Please Enter the character: ");
	     ch=s.next().charAt(0);
	     
		if (ch >= 'A' && ch <= 'Z')  
		{
            System.out.println("\n" + ch +" is an UpperCase character");  
      
		}
        else if (ch >= 'a' && ch <= 'z')  
        {
            System.out.println("\n" + ch +" is an LowerCase character" );  
        }
	}

}
