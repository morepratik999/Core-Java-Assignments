
public class PinkYellow 
{
public static void main(String args[])
  {
	 int i,j,cnt1=0,cnt2=0,cnt3=0;
	 for(i=33;i<=999;i++)
	 {
		 if(i%3==0)
		 {
			 System.out.println("PINK");
			 cnt1++;
		 }
		 if(i%5==0)
		 {
			 System.out.println("YELLOW");
			 cnt2++;
			 
		 }
		 if(i%3==0 && i%5==0)
		 {
			 System.out.println("PINK & YELLOW");
		     cnt3++;
		 }
		 
	 }
	 System.out.println(cnt1+" Times PINK was printed..");
	 System.out.println(cnt2+" Times YELLOW was printed..");
	 System.out.println(cnt3+" Times PINK & YELLOW  was printed..");

	 
	 
  }
}
