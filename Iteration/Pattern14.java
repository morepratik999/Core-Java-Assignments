public class Pattern14
{
	public static void main(String args[])
	{
		int cnt;
		for(int i=1 ; i<=5 ; i++)
		{    
			cnt=i;
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(cnt+" ");
				cnt--;
			}
			
			System.out.println();
		}
		
	}
}

	