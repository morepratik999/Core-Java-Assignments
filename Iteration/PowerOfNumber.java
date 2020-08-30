import java.util.Scanner;

public class PowerOfNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=0,p=2;
        System.out.println("Enter a Number : ");
        
         number=sc.nextInt();
        long result = 1;
        
        int i=p;
        while (i != 0)
        {
            result *= number;
            --i;
        }
        System.out.println(number+"^"+p+" = "+result);
    }
}