import java.util.Scanner;
public class PalindromeOrNot {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num,rev=0,rem,originalnum;
        System.out.println("Enter a number : ");
        num=sc.nextInt();       
        originalnum = num;
        while( num != 0 )
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
       
        if (originalnum == rev)
             {
            System.out.println(originalnum + " is a palindrome.");
             }

        else
            {
            System.out.println(originalnum + " is not a palindrome.");
            }
    }
}