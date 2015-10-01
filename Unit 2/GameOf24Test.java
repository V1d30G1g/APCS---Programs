package JavaPackage.Q1;

import java.util.Scanner;

public class GameOf24Test 
{

	public static void main(String[] args) 
	{
		int runTime = 0;
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n <= 3)
			System.out.println("NO");
		
		else
		{
			
			if(n % 2 == 0)
			{
				
				for(int i = n; i > 4; i = i - 2)
				{
					
					System.out.println(i + " " + "- " + (i - 1) + " " + "= " + 1);
					
					runTime++;
					
				}
				
				System.out.println("1 * 2 = 2");
				System.out.println("2 * 3 = 6");
				System.out.println("6 * 4 = 34");
				
				
			}
			
		}	
			
			else
			{
				
				for(int i = n; i > 5; i = i - 2)
				{
					
					System.out.println(i + " " + "- " + (i - 1) + " " + "= " + 1);
				
				}
			
				System.out.println("5 * 4 = 20");
				System.out.println("3 + 2 = 5");
				System.out.println("5 - 1 = 4");
				System.out.println("20 + 4 = 24");
			
				
		}
		
		scan.close();
	}
		
		
}


