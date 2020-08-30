import java.lang.*;

class DisplayNum
{
   public static void main(String args[])

  {
    int i,j=1,k=1;
   System.out.println("USING FOR LOOP");
   for(i=1;i<=10;i++)
   {
 	System.out.print(i+"  ");
   }
  System.out.println("\n###########################################################################################################");

System.out.println("USING WHILE LOOP");
   while(j<=10)
    {   
	System.out.print(j+"  ");
        j++;
     }
   System.out.println("\n###########################################################################################################");
 

     System.out.println("USING DO...WHILE LOOP");
    do
    {  
	System.out.print(k+"  ");
        k++;
     }while(k<=10);
  }
}