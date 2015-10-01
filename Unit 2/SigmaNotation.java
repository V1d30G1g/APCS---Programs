package JavaPackage.Q1;

import java.util.Scanner;

public class SigmaNotation 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		
		int n = scan.nextInt();
		boolean[] comp = new boolean[n+1];
		for (int i = 2; i <= n; i++) 
		{
			
			int j;
			
			if(!comp[i])
			{
				
				j = i + i;
				
				while(j <= n)
				{
					
					comp[j] = true;
					
					j = j + i;
					
				}
				
			System.out.print(i + " ");
				
			}
			
		}
	}

}
