package JavaPackage.Q1;

public class Fibonacci 
{

public Fibonacci()
{
	
	
	
}

	public static void getSequence(int n)
	{
		
		int x = 0;
		int y = 1;
		
		for(int i = 1; i <= n; i++)
		{
			int tmp = y;
			
			y = x + y;
			
			x = tmp;
			
			System.out.print(y + " ");
			
			
		}
		
	}
	
}
