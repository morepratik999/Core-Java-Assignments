
import java.util.Scanner;

public class Fibonacci{

    public static void main(String[] args)
      {
           Scanner sc=new Scanner(System.in);
           
        int count=0, num1 = 0, num2 = 1;
         System.out.println("Enter a number for fibonacci series  : ");
         count=sc.nextInt();
        System.out.print("Fibonacci Series of "+count+" numbers:");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");
            int sum= num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}

